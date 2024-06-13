import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame_01 {
	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기

		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		int computer, user;

		System.out.println("가위바위보 게임을 진행하겠습니다.");
		System.out.println("가위(0), 바위(1), 보(2)중에서 입력하세요.");
		computer = r.nextInt(3); // 0-2 사이에 숫자 중 랜덤으로 나오게 만들기
		user = scan.nextInt();
		
		//컴퓨터에 들어가는 값
		if(computer==0){
			System.out.println("컴퓨터가  가위를 냈습니다.");
		}else if (computer==1){
			System.out.println("컴퓨터가 바위를 냈습니다.");
		}else{
			System.out.println("컴퓨터가 보를 냈습니다.");			
		}
		
		// 유저가 입력하는 값 - 가위(0)를 선택한 경우
		if(user==0){
			if(computer==1){
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(computer==2){
				System.out.println("컴퓨터가 졌습니다.");
			}else{
				System.out.println("무승부입니다.");
			}
		
		// 유저가 입력하는 값 - 바위(1)를 선택한 경우
		}else if(user==1){
			if(computer==2){
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(computer==0){
				System.out.println("컴퓨터가 졌습니다.");
			}else{
				System.out.println("무승부입니다.");
			}

		// 유저가 입력하는 값 - 보(2)를 선택한 경우
		}else{
			if(computer==0){
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(computer==1){
				System.out.println("컴퓨터가 졌습니다.");
			}else{
				System.out.println("비겼습니다.");
			}
		}
		
		{ scan.close(); } //종료
	}
}