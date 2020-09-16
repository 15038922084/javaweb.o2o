/**
 * 
 */
$(function(){
	
	var initUrl="/o2o/shopadmin/getshoopinitinfo"; //获取店铺的初始信息
	var registerShopUrl="/o2o/shopadmin/registerShop"; // 获取店铺的注册信息
	alert(initUrl);
	getShopInitInfo();
	
	function getShopInitInfo(){
		$.getJSON(initUrl,function(data){
			if(data.success){
				var tempHtml="";
				var tempAreaHtml="";
				data.shopCategoryList.map(function(item,index){
					tempHtml += '<option data-id="'+item.shopCategoryId +'">'
					+item.shopCategoryName + '</option>';	
				});
				
				data.areaList.map(function(item,index){
					tempAreaHtml += '<option data-id= "'+item.areaId + '">'
					+ item.areaName + '</option>';
				});
				
				//把后台的#shop-category，#area两个信息填充到 店铺分类和所属区域两个控件
				$('#shop-category').html(tempHtml); 
				$('#area').html(tempAreaHtml);
			}	
		});	
		
		$('#submit').click(function(){
			var shop = {};
			shop.shopName = $('#shop-name').val();
			shop.shopAddr = $('#shop-addr').val();
			shop.phone = $('shop-pohone').val();
			shop.shopDesc = $('shop-desc').val();
			shop.shopCategory = {
					shopCategoryId:$('#shop-category').find('option').not(function(){
						return !this.selected;
					}).data('id')
			};	
			
			shop.area = {
					areaId:$('#area').find("option").not(function(){
						return !this.selected;
					}).data("id")
			};
			var shopImg = $('#shop-img')[0].files[0];
			var formData = new FormData();
			formData.append('shopImg',shopImg);
			formData.append('shopStr',JSON.stringify(shop));
			$.ajax({
				url:registerShopUrl,
				type:'POST',
				data:formData,
				contentType:false,
				proceesData:false,
				cache:false,
				success:function(data){
					if(data.success){
						$toast("提交成功！");
						
					}else{
						$.toast('提交失败！'+data.errMsg);
					}
				}
				
					
			})
			
		});
	}
	
})