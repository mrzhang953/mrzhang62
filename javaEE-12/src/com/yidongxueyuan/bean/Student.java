package com.yidongxueyuan.bean;

import java.io.Serializable;

/**
 * JavaBean ʵ���ࣺ 
 * 
 * @author Mrzhang
 *
 */
public class Student implements Serializable{
	private String username; 
	private String age; 
	
	public Student(String username, String age){
		this.username = username; 
		this.age = age; 
	}
	


	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public Student(){
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}
	
	/*
	 *  xxx Ҳ��һ�����ԣ� 
	 *  set ������ get �� ����д��ĸ����Сд������javaBean �����ԣ�
	 */
/*	public void setXxx(String username){
		
	}
	*/
	
	

}
