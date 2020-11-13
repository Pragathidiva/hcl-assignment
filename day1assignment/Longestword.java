package day1assignment;

import java.util.StringTokenizer;

public class Longestword {
	public String lengthiestString(String s1) {
		int max = 0;
		String s2 = new String();
		StringTokenizer t = new StringTokenizer(s1, " ");
		while (t.hasMoreTokens()) {
			String s3 = t.nextToken();
			int n = s3.length();
			if (n > max) {
				max = n;
				s2 = s3;
			}
		}
		return s2;

	}
}
