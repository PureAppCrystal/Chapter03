package Chapter03;

public class Goods {
	private static int countOfGoods; //static -> method Area에 생성되어 딱 하나만 생성됨. 전역변수급
	public static final double DISCOUNT_RATE = 0.3;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	// 생성자
	public Goods() {
		countOfGoods++;
		
	}
	
	
	// getter, setter
	public String getName() { 
		return name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if ( price < 0 ) {
			price = 0;
		}
		
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public static int getCountOfGoods() {
		//System.out.println("CountOfGoods : "+countOfGoods);
		return countOfGoods;
	}
	
	
	
	// 함수
	public void showInfo() {
		//private  은 내부에서만 접근이 가능하다.
		System.out.println("Goods[name] 		: "+name);
		System.out.println("Goods[price] 		: "+price);
		System.out.println("Goods[countStock] 	: "+countStock);
		System.out.println("Goods[countSold] 	: "+countSold);
	}
	
	public int calcDiscountPrice(int percentage ) {
		int discountPrice = this.price - (this.price * percentage / 100 );
		return discountPrice;
	}
	
	
	
	
}
