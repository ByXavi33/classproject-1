package chapter04;

public class ForLoopTest {
	
	public static void main(String[] args) {
		
		//구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
		//단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
		
		
		for(int i=2; i<10; i *= 2) {
			System.out.println(i);
			
			
		for(int e=1; e<=i; e++) {
			System.out.println(i + "x" + e + "=" + i*e);
		
	}
		}
		}

}
