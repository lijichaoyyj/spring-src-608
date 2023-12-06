package com.cst.it.config;

import com.cst.it.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cst.it.bean","com.cst.it.iocbeanlifecicle"})
public class JavaConfig {

@Bean
public User user(){
	return  new User();

}

}
