package com.yidongxueyuan.introspector;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.yidongxueyuan.bean.Student;

/**
 * 使用Apache提供的jar 包完成内省操作： 
 * 满足一个约定： map集合当中的key 必须是实体bean的属性的名称： 
 * @author Mrzhang
 *
 */
public class TestIntrospector {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("username", "lisi");
		map.put("age", "21");
		
		Student stu = new Student();
		//直接将map集合当中的数据， 封装到了实体bean当中： 
		//BeanUtils.populate(stu, map);
		//System.out.println(stu);
		
		
		//能够给对象设置具体的某个属性的值： 
		BeanUtils.setProperty(stu, "username", map.get("username"));
		BeanUtils.setProperty(stu, "age", map.get("age"));
		System.out.println(stu);
		
		//获得对象的具体的某个属性的值： 
		String name = BeanUtils.getProperty(stu, "username");
		String age = BeanUtils.getProperty(stu, "age");
		System.out.println(name+"::"+age);
	}
}
