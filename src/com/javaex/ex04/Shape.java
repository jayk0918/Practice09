package com.javaex.ex04;

public abstract class Shape {
    
	// 필드
	private int countSides;

	// 생성자
	public Shape() {}
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	// 메소드 gs
	public int getCountSides() {
		return countSides;
	}
	
	// 메소드 일반
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
    
}
