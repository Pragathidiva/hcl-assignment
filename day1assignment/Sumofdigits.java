package day1assignment;

public class Sumofdigits {
	public int sumevenumber(int num) {
		int lastdigit = 0;
		int evendigit = 0;
		while (num != 0) {
			lastdigit = num % 10;
			if (lastdigit % 2 == 0) {
				evendigit += lastdigit*lastdigit;
			}num=num/10;
		}
		return evendigit;
	}
}



