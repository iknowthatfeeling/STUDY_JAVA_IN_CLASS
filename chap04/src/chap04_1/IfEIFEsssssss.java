package chap04_1;

import java.util.Scanner;

public class IfEIFEsssssss {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("점수 입력 : ");
	int score = scan.nextInt();
	
	if(score >=90)
		System.out.println("A학점");
	else if (score >=80)
		System.out.println("B학점");
	else if (score >= 70)
	System.out.println("C학점");
	else if (score >= 60)
		System.out.println("D학점");
	else
		System.out.println("F학점");
	}

}
