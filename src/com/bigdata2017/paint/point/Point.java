package com.bigdata2017.paint.point;

import com.bigdata2017.paint.interface_main.Drawable;
import com.bigdata2017.paint.interface_main.Resizable;

public class Point implements Drawable, Resizable {
	private int x;
	private int y;
	
	
	
	//contructor	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	
	
	//getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	//function
	public void show() {
		System.out.println("점 [x = "+ x +", y = "+ y +" ]을 그렸습니다.");
	}
	
	
	public void show( boolean visible ) {
		if ( visible ) {
			show();
		} else {
			System.out.println("점 [x = "+ x +", y = "+ y +" ]을 지웠습니다.");
		}
		
	}




	@Override
	public void draw() {
		show();
	}

	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		
	}

	
	

}
