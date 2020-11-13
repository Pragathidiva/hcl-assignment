package day1assignment;

public class Operations {
	public int operation1 (int num1 , int num2,int num3)
	{
		return (-num1+(num2*num3));
		
	}
	public int operation2 (int num1 , int num2)
	{
		return ((num1+num2)%num2);
	}
	public int operation3 (int num1 , int num2,int num3,int num4)
	{
		return (num1+(-num2)*(num3/num4));
		
	}
	public int operation4 (int num1 , int num2,int num3,int num4,int num5,int num6)
	{
		return (((((num1+num2)/num3)* num4)-num5)% num6);
	}	

}/*-5 + 8 * 6

b. (55+9) % 9

c. 20 + -3*5 / 8

d. 5 + 15 / 3 * 2 - 8 % 3*/