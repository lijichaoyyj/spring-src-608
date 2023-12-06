package com.cst.it;

import com.cst.it.bean.User;
import com.cst.it.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClazz {

	public static void main(String[] args) {

		// JavaConfig.class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// context.scan("com.cst.it.bean");
		User user = context.getBean("user", User.class);
		// user.setUserId("000001");
		// user.setUserName("zhangsan");
		System.out.println(user);
	}
}
