package com.yidongxueyuan.util;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * ���ã���map���ϵ��е�����ֱ�ӷ�װ��javaBean���У� 
 * @author Mrzhang
 *
 */
public class ToBean {

	/**
	 * 
	 * @param map map����
	 * @param clazz ʵ��bean��Class����
	 * @return ���س�ȥ��һ����ȷ���Ķ��� 
	 */
	public static <T> T toBean(Map map, Class clazz) {// T ����ֵ���� <T> ��̬�����ϵķ�����ʹ�õ�ʱ�򣬣���������
		
		try {
			//clazz ��������һ��ʵ��bean
			T  bean =(T) clazz.newInstance();
			
			BeanUtils.populate(bean, map); 
			return bean; 
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
