package com.imooc.o2o.web.ShopAdmin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.HttpServletRequestUtil;

@Controller
@RequestMapping("/shopadmin")

public class ShopManagementController {
	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/registerShop", method = RequestMethod.POST)
	// 注解自动将方法返回的Map类型的值，转化成json对象
	@ResponseBody
	private Map<String, Object> registerShop(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 1.接受并转化前端传递进来的参数，包括店铺信息以及图片信息等
		// "shopStr"参数是跟前端约定好的字符串
		String shopStr = HttpServletRequestUtil.getString(request, "shopStr");
		// 将传递的参数转化成实体类,所用到的ObjectMapper类
		ObjectMapper mapper = new ObjectMapper();
		// 接收参数的对象引用
		Shop shop = null;
		try {
			// 转化前端传递进来的参数
			shop = mapper.readValue(shopStr, Shop.class);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
			return modelMap;
		}

		// 接收图片/文件，使用的是spring自带的CommonsMultipartFile
		CommonsMultipartFile shopImg = null;
		// 文件上传解析器，用来解析request上传的文件信息(从request的session会话的上下文去获取相关文件上传内容)
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// isMultipart()判断是否有上传文件
		if (commonsMultipartResolver.isMultipart(request)) {
			// 有，则把request对象进行转换，转换成MultipartHttpServletRequest类型的对象
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
			// 提取出multipartHttpServletRequest对象中相对应的文件流
			shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("shopImg");

		} else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "上传图片不能为空");
			return modelMap;
		}

		// 2。注册店铺
		if (shop != null && shopImg != null) {
			// 对于前端传递过来的信息越少依赖越好，对于店铺注册来说可以使用session获取里面的信息
			// 暂时未用session，之后会用,所以先对owner进行初始化
			PersonInfo owner = new PersonInfo();
			owner.setUserId(1L);
			shop.setOwner(owner);
			// 前端传递的信息添加到shop里面去
			ShopExecution se;
			try {
				se = shopService.addShop(shop, shopImg.getInputStream(), shopImg.getOriginalFilename());
				if (se.getState() == ShopStateEnum.CHECK.getState()) {
					modelMap.put("success", false);
				}
			} catch (ShopOperationException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());

			} catch (IOException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());

			}
			return modelMap;

		} else {
			modelMap.put("success", false);
			modelMap.put("errMeg", "请输入店铺信息");
			return modelMap;

		}
		// 3.返回结果

	}

	private static void InputStreamToFile(InputStream ins, File file) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
