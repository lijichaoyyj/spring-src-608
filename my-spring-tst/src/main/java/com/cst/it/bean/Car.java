package com.cst.it.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 实现初始化接口
 *
 */
@Component
public class Car  implements InitializingBean {

	private  String brand;
	private  boolean price;

	/**
	 * bean 实例化设置属性之后回调该方法 .
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("InitializingBean->实例化设置属性之后回调该方法");

	}


}
