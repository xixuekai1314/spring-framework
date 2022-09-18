package com.taiping.kai.config.ImportRegistrar;

import com.taiping.kai.bean.Cat;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MyImportRegistrar
 * @Description: TODO
 * @Author: Kai
 * @Date: 2022年09月17日 19:01:34
 **/
public class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
	
	/**
	 * @Description: BeanDefinitionRegistry: bean定义信息注册中心
	 *                 里边都是BeanDefinition
	 * @Author: Kai
	 * @Date: 2022/9/17 19:03
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		//构造BeanDefinition bean的定义
		//     可以声明定义信息，包括我需要自动装配什么
		RootBeanDefinition catDefinition = new RootBeanDefinition();
		catDefinition.setBeanClass(Cat.class);
		//Spring bean 的名字 和 配置
		registry.registerBeanDefinition("tomCat", catDefinition);
	}
}
