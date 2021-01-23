package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//		 깃허브 연동 프로젝트
	
		Scanner myScanner = new Scanner(System.in);

//		6개의 숫자를 저장할 배열 만들기
		int arr[] = new int[6];
//		횟수를 6번으로 제한할 변수
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.println((i+1)+"번째 로또 번호 입력 : ");
			int input = myScanner.nextInt();
			arr[i] = input;
		}
		
		

	}
}
