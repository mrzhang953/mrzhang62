package com.yidongxueyuan.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.yidongxueyuan.bean.Student;

/**
 * ��ʡ�� ��ʵ��bean���з�װ�����ݣ� ���õ�map���ϵ��У� 
 * @author Mrzhang
 *
 */
public class IntrospectorDemo {
	public static void main(String[] args) throws IntrospectionException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//����һ��Map���ϣ� 
		Map<String,String> map = new HashMap<String, String>();
		map.put("username", "lisi");
		map.put("age", "21");
		
		//Student stu = new Student("lisi",21);
		
		
		//���һ��ʵ��bean��Info�� 
		//���Studentʵ��bean�����е���Ϣ�� �����е���Ϣ��װ����BeanInfo ��������У� 
		BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
		
		//���÷����� ���info�����е����е�����������L:
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		
		//����JavaBean�� 
		Class c = Class.forName("com.yidongxueyuan.bean.Student");
		
		//������һ��ʵ��bean��bean����û�з�װ�κ����ݵģ� 
		Student s =(Student)c.newInstance();
		
		//�������ÿһ���� 
		for (PropertyDescriptor pd : pds) {
			String name = pd.getName();
			//System.out.println(name);//������Ե����ƣ� age username class
			//���map���ϵ���key ��Ӧ��value��
			String val = map.get(name);
			if(val!=null){
				//�������䣺 
				Method method = pd.getWriteMethod();
				method.invoke(s, val);// stu.setUsername(xxx);
			}
			
			
		}
		
		System.out.println(s);
	}

}
