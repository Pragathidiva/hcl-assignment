package day1assignment;

public class Prime {
	public String number(int num) {
		int flag = 0;
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				flag = 1;
			}
		}

		if (flag == 0) {
			return num + " is prime number";
		} else {
			return num + " is not a prime number";
		}
	}

}
