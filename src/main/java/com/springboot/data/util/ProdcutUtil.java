package com.springboot.data.util;

import java.util.ArrayList;
import java.util.List;

import com.springboot.data.beans.ProductBean;

public class ProdcutUtil {

	public static List<ProductBean> getProducts() {

		List<ProductBean> productList = new ArrayList<>();

		ProductBean productBean = new ProductBean();
		productBean.setProductId(101);
		productBean.setProductName("LG");

		ProductBean productBean1 = new ProductBean();
		productBean1.setProductId(102);
		productBean1.setProductName("Sony");

		ProductBean productBean2 = new ProductBean();
		productBean2.setProductId(102);
		productBean2.setProductName("Samsung");

		productList.add(productBean);
		productList.add(productBean1);
		productList.add(productBean2);

		return productList;
	}

}
