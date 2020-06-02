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
 * 内省： 将实体bean当中封装的数据， 设置到map集合当中： 
 * @author Mrzhang
 *
 */
public class IntrospectorDemo {
	public static void main(String[] args) throws IntrospectionException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//创建一个Map集合： 
		Map<String,String> map = new HashMap<String, String>();
		map.put("username", "lisi");
		map.put("age", "21");
		
		//Student stu = new Student("lisi",21);
		
		
		//获得一个实体bean的Info： 
		//获得Student实体bean的所有的信息， 将所有的信息封装到了BeanInfo 这个对象当中： 
		BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
		
		//调用方法： 获得info对象当中的所有的属性描述符L:
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		
		//创建JavaBean： 
		Class c = Class.forName("com.yidongxueyuan.bean.Student");
		
		//创建了一个实体bean：bean当中没有封装任何数据的： 
		Student s =(Student)c.newInstance();
		
		//遍历获得每一个： 
		for (PropertyDescriptor pd : pds) {
			String name = pd.getName();
			//System.out.println(name);//获得属性的名称： age username class
			//获得map集合当中key 对应的value：
			String val = map.get(name);
			if(val!=null){
				//依赖反射： 
				Method method = pd.getWriteMethod();
				method.invoke(s, val);// stu.setUsername(xxx);
			}
			
			
		}
		
		System.out.println(s);
	}

}
