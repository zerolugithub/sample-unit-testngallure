package com.kitty.demo.TestNGAllure;

/**
 * 
 * 模拟待测应用:邮箱生成器
 */
public class Application {

	public String generateEmail(String input) {
		if (input == null) {
			throw new RuntimeException("输入为null,请输入正确参数");
		}
		return input + "@testfan.com";
	}

}
