package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int inputNum = scanner.nextInt();
		for (int i = 1; i <= inputNum; i++) {
			if (i % 2 == 0) {
				even += i;
			} else if (i % 2 == 1) {
				odd += i;
			}
		}

		if (inputNum % 2 == 0) {
			System.out.println("결과값 : " + even);
		} else if (inputNum % 2 == 1) {
			System.out.println("결과값 : " + odd);
		}

		scanner.close();
	}
}
