package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int inputNum = scanner.nextInt();
		if(inputNum%3==0) {
			System.out.println("3의 배수입니다");
		}
		
		
		scanner.close();
	}
}
