package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
	// 필드
	private double width;
	private double height;
	
	// 생성자
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
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
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public void resize(double s) {
		width = this.width * s;
		height = this.height * s;
	}
	
	public double getArea() {
		double result = width * height;
		return result;
	}
	
	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}
	
	
	
	
	
	
	
	
	
}