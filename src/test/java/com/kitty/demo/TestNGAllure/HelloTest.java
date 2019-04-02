package com.kitty.demo.TestNGAllure;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

/**
 * 
 * 邮箱生成器：单元测试代码
 * 
 */
public class HelloTest {
	Application application;
	
	@BeforeClass
	public void BeforeClass(){
		application=new Application();
	}

	
	@Epic("正向Epic")
	@Story("正向Story")
	@Step("通过DataProvider注入三组不同数据，验证生成邮箱为数据@testfan.com")
	@Severity(SeverityLevel.CRITICAL)
	@Test(dataProvider="emailProducer",description="邮箱生成的正向测试用例")
	public void testEmailGeneration(String input,String email){
		Assert.assertEquals(application.generateEmail(input), email);
	}
	
	@Epic("反向Epic")
	@Story("反向Story")
	@Step("输入Null参数验证邮箱生成器")
	@Severity(SeverityLevel.NORMAL)
	@Test(description="邮箱生成的反向测试用例")
	public void testEmailGenerationException(){
		String result=application.generateEmail(null);
	}
	
	@DataProvider(name="emailProducer")
	public Object[][] generateEmail(){
		return new Object[][]{{"kitty1","kitty1@testfan.com"},{"test1","test1@testfan.com"},{"fan","fan@testfan.com"}};
	}
	
	
	
	
}
