package com.taiping.kai.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: Kai
 * @Date: 2022年09月17日 18:43:39
 **/

@Component
public class Person {
	private String name;
	private String age;
	private Cat cat;

	/**
	 * @Description: Lookup  去容器中着 依据容器中的条件判断如何生成
	 * 					想要依赖的组件是多实例，就不能@Autowired
	 * 				@Bean 方式注册的Person不会生效
	 * @Author: Kai
	 * @Date: 2022/9/17 19:42
	 */
	@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
