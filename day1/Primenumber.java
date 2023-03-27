package week1.day1;

public class Primenumber {
	public static void main(String[] args) {
		

	int i,j=13;
	boolean p=true;
	
	for(i=2; i<j; i++) {
		if(j%i==0) {
			p = false;
			break;
		}
	}
	
	if(p == true){
		System.out.println(j + " a prime number ");
	}else {
		System.out.println(j + " is not a prime number ");
	}
}
}