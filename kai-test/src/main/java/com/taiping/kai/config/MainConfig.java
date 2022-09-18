package com.taiping.kai.config;

import com.taiping.kai.bean.Person;
import com.taiping.kai.config.ImportRegistrar.MyImportRegistrar;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MainConfig
 * @Description: 这是一个配置类
 * @Author: Kai
 * @Date: 2022年09月12日 19:02:23
 **/
//@Import({MyImportRegistrar.class})
@ComponentScan("com.taiping.kai")
@Configuration
public class MainConfig {

//	@Bean
//	public Person person(){
//		Person person = new Person();
//		person.setName("li");
//		return person;
//	}
}
