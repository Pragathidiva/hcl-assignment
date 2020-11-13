package day2assignment;

public class Minimum {
	public void smallnumber(int num1,int num2,int num3) {
		if(num1 < num2 && num1 <num3) {
		System.out.println("smallest number is :"+num1);
		}
		else if (num2<num1 &&num2 <num3) {
			System.out.println("smallest number is :"+num2);
			
		}else if (num3<num1 && num3 < num2) {
			System.out.println("smallest number is :"+num3);
		}
		
	}

}
