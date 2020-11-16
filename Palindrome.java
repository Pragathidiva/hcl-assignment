package day3assignment;

public class Palindrome {
	public void checkpalindrome(String A) {
		String temp = "";
		for (int i=A.length()-1;i>=0;i--) {
			temp = temp + A.charAt(i);
		}
		if(A.equals(temp)) {
		System.out.println("YES");
		}
		else
		{
		System.out.println("NO");	
		}
	}
}
