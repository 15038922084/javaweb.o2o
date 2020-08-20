package com.imooc.o2o.web.ShopAdmin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shopadmin")

public class ShopManagementController {
	@RequestMapping(value = "/registerShop", method = RequestMethod.POST)
	// 注解自动将方法返回的Map类型的值，转化成json对象
	@ResponseBody
	private Map<String, Object> registerShop(HttpServiceRequest request) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 1.接受并转化前端传递进来的参数，包括店铺信息以及图片信息等

		// 2。注册店铺
		// 3.返回结果
	}
}
