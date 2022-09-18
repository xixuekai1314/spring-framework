package com.taiping.kai.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Cat
 * @Description: TODO
 * @Author: Kai
 * @Date: 2022年09月17日 19:06:36
 **/
@Scope(scopeName = "prototype")
@Component
public class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat() {
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
