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

			while(true) {
//			숫자입력코드
			System.out.println((i+1)+"번째 로또 번호 입력 : ");
			int input = myScanner.nextInt();
//			입력해도 되는 숫자인지 검사
//			검사1 : 입력받은 숫자가 1~45의 값인가
			boolean isRangeOk = (1<= input && input <=45) ;
			
			if (isRangeOk) {
//			검사2 : 
//			배열에 저장

			arr[i] = input;
//			올바른 결과가 들어갔으면 while문을 종료.
//			다음 자리의 숫자를 받으러 이동.
			break;
		}
			else {
				System.out.println("다시 입력하세요");
			}
			}
		for(int num : arr) {
			System.out.println(num);
		}
		
		}
	}
}
