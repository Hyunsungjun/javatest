//package chapter01;
//
//public class Logical {
//
//	public static void main(String[] args) {
//		int a = 7;
//		int b = 3;
//		
//		System.out.println(a == b || a > b);
//		System.out.println(a == b && a > b);
//		
//		System.out.println(a != b || a > b);
//		System.out.println(a != b && a > b);
//		
//		int a1 = 20;
//		int a2 = 15;
//		int a3 = 8;
//		//최대값 판별 조건 결과: 최대값은 20입니다
//		
//		if (a1 >= a2) { // a1 a2
//			if (a1 > a3) {
//				System.out.println("a1이 최대");
//			} else { //a3 >= a1 >= a2
//				System.out.println("a3이 최대");
//			}
//		
//	} else { //a3 a2 a1
//		if(a2 > a3) {
//			System.out.println("a2이 최대");
//		}else {
//			System.out.println("a3이 최대");
//		}
//	}
//}
//
//
package chapter01;

public class Logical {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a == b || a > b);
		System.out.println( a == b && a > b);
		
		System.out.println( a != b || a > b);
		System.out.println( a != b && a > b);
		
		System.out.println( !(a > b));
		
	}

}