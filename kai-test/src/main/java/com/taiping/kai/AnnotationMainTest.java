package com.taiping.kai;

import com.taiping.kai.bean.Cat;
import com.taiping.kai.bean.Person;
import com.taiping.kai.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: AnnotationMainTest
 * @Description: 注解版Spring的用法
 * @Author: Kai
 * @Date: 2022年09月12日 19:00:15
 **/
public class AnnotationMainTest {


	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames) {
//			System.out.println(beanDefinitionName);
//		}
		//cat是原型模式，所以不同
//		Cat bean1 = applicationContext.getBean(Cat.class);
//		Cat bean2 = applicationContext.getBean(Cat.class);
//		System.out.println(bean1 == bean2);
		//persion是同一个，因此cat也是同一个 想要不同的cat  就要用到注解 Lookup
		Person bean1 = applicationContext.getBean(Person.class);
		Person bean2 = applicationContext.getBean(Person.class);
		Cat cat1 = bean1.getCat();
		Cat cat2 = bean2.getCat();
		System.out.println(bean1 == bean2);
		System.out.println(cat1 == cat2);
		System.out.println(cat1);
		System.out.println(cat2);
	}


}
