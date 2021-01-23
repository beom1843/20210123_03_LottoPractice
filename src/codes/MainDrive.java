package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//		 깃허브 연동 프로젝트

		Scanner myScanner = new Scanner(System.in);

//		6개의 숫자를 저장할 배열 만들기
		int arr[] = new int[6];
//		횟수를 6번으로 제한할 변수

		for (int i = 0; i < arr.length; i++) {

			while (true) {

//			숫자입력코드
				System.out.println((i + 1) + "번째 로또 번호 입력 : ");
				int input = myScanner.nextInt();
//			입력해도 되는 숫자인지 검사
//			검사1 : 입력받은 숫자가 1~45의 값인가
				boolean isRangeOk = (1 <= input && input <= 45);
				
//				추가 검사 : 중복인지 아닌지.
//				중복인가? : 내가 입력한 숫자가 이미 배열안에 들어있다면 ? 중복(사용불가)
				
//				중복검사 결과
				boolean isDuplOk = true;
				
//				배열 안의 숫자를 모두 꺼내보자.
				
				for(int arrNum : arr) {
//					입력한 값과 arrNum이 같다면 중복검사에서 탈락
					if(input == arrNum) {
//						중복값 발견 ! 검사 탈락 처리
						isDuplOk = false;
//						중복 확정이면 for문 종료
						break;
					}
				}
				
				if (isRangeOk && isDuplOk) {
//			범위도 OK고 중복여부도 통과해야
//			배열에 저장

					arr[i] = input;
//			올바른 결과가 들어갔으면 while문을 종료.
//			다음 자리의 숫자를 받으러 이동.
					break;
				} else if(!isRangeOk){
//					범위 검사에 실패했다면
					
					System.out.println("1~45의 숫자만 입력 가능합니다.");
				}
				else {
//					범위는 맞았다면
					System.out.println("이미 입력된 번호입니다.");
					System.out.println("다른 숫자로 입력해주세요.");
				}
			}



		}
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
