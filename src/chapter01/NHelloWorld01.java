package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		//2번째로 사용해보는 클래스
		new String("Hello");//기본생성
		Scanner scanner = new Scanner(System.in); //생성자 이므로 () c+sh+o해서 임포트 해줘야된다
		//Scanner를 변수로 할당함으로써 사라지지 않게된
		int count = scanner.nextInt();
		
		
		
		int i = 0; //초기
		while(i<count) {//조건 
			System.out.println("HelloWorld");
			i++;
		}
		scanner.close();//안해도 상관없으나 해주는게 좋

	}

}
