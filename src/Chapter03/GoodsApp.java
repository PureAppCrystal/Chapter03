package Chapter03;

import myPackage.Goods2; 

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		//private  은 내부에서만 접근이 가능하다.
		//goods.name = "nikon";
		//goods.price = 200000;
		//goods.countSold = 10;
		//goods.countStock = 100;
		
		//private  은 내부에서만 접근이 가능하다.
		//System.out.println("name : "+goods.name);
		//System.out.println("price : "+goods.price);
		//System.out.println("countSold : "+goods.countSold);
		//System.out.println("countStock : "+goods.countStock);
		
		
		goods.setName("nikon");
		goods.setPrice(10000);
		goods.setCountSold(10);
		goods.setCountStock(100);
		
		
		/*
		System.out.println("name : "+goods.getName());
		System.out.println("price : "+goods.getPrice());
		System.out.println("countSold : "+goods.getCountSold());
		System.out.println("countStock : "+goods.getCountStock());
		*/
		
		goods.showInfo();
		System.out.println("--------------------");
		System.out.println("30% discounted price : "+ goods.calcDiscountPrice(30) );
		
		
		
		
		
		// default 접근자 필드는 다른 패키지에서는 접근 불가
		/*
		Goods2 goods2 = new Goods2();
		goods2.name = "cannon";
		goods2.price = 500000;
		goods2.countSold = 15;
		goods2.countStock = 50;
		*/
		
		//public 	: 외부
		//protected : 같은패키지 + 자식
		//private 	: 내부만 가능. (자식x)
		//default	: 다른패키지 x
		
		System.out.println("--------------------");
		
		Goods g1 = new Goods();
		System.out.println("countOfGoods : "+Goods.getCountOfGoods() );
		
		g1 = new Goods();
		System.out.println("countOfGoods : "+Goods.getCountOfGoods() );

		g1 = new Goods();
		System.out.println("countOfGoods : "+Goods.getCountOfGoods() );
		
		
		System.out.println("--------------------");
		
		final int VALUE = 10;
		// value = 20;
		
		// System.out.println( Math.PI );
		
		
		

	}

}
