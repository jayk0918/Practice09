package com.javaex.ex04;

public class RectTriangle extends Shape {
	
	// 필드
	private double width;
	private double height;
	
	// 생성자
	public RectTriangle() {
		super();
	}

	public RectTriangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// 메소드 gs
	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	// 메소드 일반
	public double getArea() {
		double result = (this.width) * (this.height) * 0.5;
		return result;
	}
	
	public double getPerimeter() {
		double result = (this.width) + (this.height) + (Math.sqrt(width) + Math.sqrt(height));
		return result;
	}
	
	
	
}