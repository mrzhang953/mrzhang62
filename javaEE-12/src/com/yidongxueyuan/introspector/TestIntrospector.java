package com.yidongxueyuan.introspector;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.yidongxueyuan.bean.Student;

/**
 * ʹ��Apache�ṩ��jar �������ʡ������ 
 * ����һ��Լ���� map���ϵ��е�key ������ʵ��bean�����Ե����ƣ� 
 * @author Mrzhang
 *
 */
public class TestIntrospector {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("username", "lisi");
		map.put("age", "21");
		
		Student stu = new Student();
		//ֱ�ӽ�map���ϵ��е����ݣ� ��װ����ʵ��bean���У� 
		//BeanUtils.populate(stu, map);
		//System.out.println(stu);
		
		
		//�ܹ����������þ����ĳ�����Ե�ֵ�� 
		BeanUtils.setProperty(stu, "username", map.get("username"));
		BeanUtils.setProperty(stu, "age", map.get("age"));
		System.out.println(stu);
		
		//��ö���ľ����ĳ�����Ե�ֵ�� 
		String name = BeanUtils.getProperty(stu, "username");
		String age = BeanUtils.getProperty(stu, "age");
		System.out.println(name+"::"+age);
	}
}
