package week1.day1;

public class Tab {
	public int tabPrice() {
		int tabPrice=25000;
		return tabPrice;
	}
	
	public String tabBrand() {
		String brandName = "Samsung";
		return brandName;
	}
	public static void main(String[] args) {
		Tab tablet=new Tab();
		System.out.println("The tabprice is "+tablet.tabPrice());
		System.out.println("The Brand name is "+tablet.tabBrand());
		
	}
	}
