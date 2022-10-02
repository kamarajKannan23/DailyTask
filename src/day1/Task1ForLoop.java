package day1;

public class Task1ForLoop {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println("count od even number 1 to 100 : " + count);
	}
}
