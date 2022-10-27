package com.bitacademy.paint.shape;

import com.bitacademy.paint.i.Drawable;

public abstract class Shape implements Drawable {
	// 필드
	private String lineColor;
	private String fillColor;
	
	
	// getter setter
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	// 메소드
	@Override
	public abstract void draw();
}
