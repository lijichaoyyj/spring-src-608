package com.cst.it.iocbeanlifecicle;

import com.cst.it.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// BeanPostProcess
		Object objOrigin = InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);

		return objOrigin;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// BeanPostProcess
		Object objOrigin = InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		return objOrigin;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		Object objOrigin  = InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
		if (beanClass== User.class) {
			User user = new User();
			user.setUserName("postProcessBeforeInstantiation-new User");
			objOrigin=user;
			System.out.println("postProcessBeforeInstantiation->new User,直接返回");
		}
       // 这里返回对象后spring容器就不再创建Bean实例了.
		return objOrigin;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		boolean bOrigin = InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
		return bOrigin;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		PropertyValues propertyValues = InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
		return propertyValues;
	}
}
