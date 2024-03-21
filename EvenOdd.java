import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		//사용자 입력
		Scanner input = new Scanner(System.in);
		System.out.print("정수를입력하시오 :");
		int number =input.nextInt();
		
		//홀짝 확인
		if(number %2==1) { 
			System.out.print("입력된 정수는 홀수 입니다.");
		}else {
			System.out.print("입력된 정수는 짝수 입니다.");
		}
		System.out.print("프로그램 종료");
	}
}