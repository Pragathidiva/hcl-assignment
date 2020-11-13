package day1assignment;

public class Fizzbuzz {
	public void fizzbuzz1() {
		for (int i = 0; i < 100; i++) {
		if(i%3==0 && i%5==0) {
			System.out.println(i+" fizzbuzz"); 
		}
		else if (i%5==0) {
			System.out.println(i+ " buzz");		
			
		}else if (i%3==0) {
			System.out.println(i+ "fizz");			
		}
			
			
		}
		
		
	}

}
