package com.yidongxueyuan.bean;

import java.io.Serializable;

/**
 * JavaBean 实体类： 
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
	 *  xxx 也是一个属性： 
	 *  set 或者是 get 后， 将大写字母换成小写，就是javaBean 的属性：
	 */
/*	public void setXxx(String username){
		
	}
	*/
	
	

}
