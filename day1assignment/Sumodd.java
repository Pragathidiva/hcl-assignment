package day1assignment;

public class Sumodd {
	public int sumoddnumber(int num) {
		int lastdidgit = 0;
		int odddigit = 0;
		while (num != 0) {
			lastdidgit = num % 10;
			if (lastdidgit % 2 != 0) {
				odddigit += lastdidgit;
			}num=num/10;
		}
		if (odddigit%2!=0) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
