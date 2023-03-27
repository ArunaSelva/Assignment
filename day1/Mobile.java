package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel= "redmi";
		float mobileWeight= 103.4f;
			
		System.out.println("The mobile model is "+ mobileModel);
		System.out.println("The mobile weight is "+ mobileWeight);
				
	}
	public void sendMsg() {
		boolean fullCharged= true;
		int mobileCost= 15000;
		
		System.out.println("Is it fully charged "+fullCharged);
		System.out.println("The mobile cost is "+mobileCost);
	
	}
	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		vivo.makeCall();
		vivo.sendMsg();
		System.out.println("This is my mobile");
	}
}
