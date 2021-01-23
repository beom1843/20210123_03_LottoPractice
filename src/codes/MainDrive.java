package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//		 깃허브 연동 프로젝트

		Scanner myScanner = new Scanner(System.in);
		
//		랜덤 당첨번호 선정
	int arr0[] = new int[6];
			for(int i = 0 ; i<6 ; i++) {
				 arr0[i] = (int)(Math.random()*45)+1;
			}
//			5개의 번호를 맞췄을 때 2등 판별
			int bonusNum = (int)(Math.random()*45)+1;
			int bonusNum0 =0;
			
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
				
				System.out.println("보너스 번호를 입력하세요");
				bonusNum0 = myScanner.nextInt();
			}



		}
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for(int j = 0 ; j <arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int backup = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=backup;
				}
			}
		}
		
		for (int num : arr) {
			System.out.println(num);
		}
		
//		내가 입력한 숫자들과 당첨번호들을 비교, 몇 개 맞췄는지? 결과로 획득.
		
		int corCount = 0;
//		내 번호 하나를 당첨번호 6개와 비교
		for (int myNum : arr) {
//			당첨번호 6개 반복
			for (int winNum : arr0) {
				
				if(myNum == winNum) {
					
					corCount++;
					
				}
			}
		}
		
//		corCount 기록돼있음.
		
		switch(corCount){
		case 6 : System.out.println("1등입니다.");
		case 5 : if(bonusNum == bonusNum0) {
			System.out.println("2등입니다.");
		}
			
		case 4: System.out.println("4등입니다.");
		case 3: System.out.println("5등입니다.");
		}
		
		
	}
}
