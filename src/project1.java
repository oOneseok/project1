import java.util.Scanner;

public class project1 {
	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보"};
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			n = (int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			String dir = scanner.next();
			if (dir.equals("가위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 비겼습니다.");
				} else if (str[n].equals("바위")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				} else if (str[n].equals("보")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");	
				} 
			} else if (dir.equals("바위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				} else if (str[n].equals("바위")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 비겼습니다.");
				} else if (str[n].equals("보")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");	
				} 
			} else if (dir.equals("보")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				} else if (str[n].equals("바위")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				} else if (str[n].equals("보")) {
						System.out.println("사용자 = " + dir +" , 컴퓨터 = " + str[n] + ", 비겼습니다.");	
				} 
			}
			if (dir.equals("그만"))
				break;
		}
		scanner.close();
	}
}