package com.example.lesson01;

//일반 java bean
//데이터 담는곳
public class Data {
	// 필드
	private int id;
	private String name;
	
	// 메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}