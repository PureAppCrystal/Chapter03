package paint;

public class ColorPoint extends Point {
	private String color;

	
	//constructor
	public ColorPoint (int x, int y, String color) {
		// setX(x);
		// setY(y);
		super(x,y);
		this.color = color;
	}
	
	
	
	//getter setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	



	//function
	@Override
	public void show() {
		System.out.println("점 [x = "+ getX() +", y = "+ getY() +", color = "+ color +" ]을 그렸습니다.");
	}
	
	/*
	@Override
	public void show(boolean visible) {
		if ( visible ) {
			show();
		} else {
			System.out.println("점 [x = "+ getX() +", y = "+ getY() +", color = "+ color +" ]을 지웠습니다.");
		}
	}
	*/
	
}
