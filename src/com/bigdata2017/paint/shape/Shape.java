package com.bigdata2017.paint.shape;

import com.bigdata2017.paint.interface_main.Drawable;

public abstract class Shape implements Drawable {
	private String fillColor;
	private String lineColor;
	
	

	
	
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}






	//public abstract void draw();  //interface를 생성하면서 삭제 
	public abstract int calcArea();
	
		
}
