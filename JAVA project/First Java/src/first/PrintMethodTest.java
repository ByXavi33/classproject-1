package first;

public class PrintMethodTest {
	
	public static void main(String[] args) {
		
		
		// print 메소드 : 매개변수로 전달하는 데이터를 출력
		System.out.print("개인 소개");
		
		// println : 매개변수로 전달된 데이터를 
		System.out.println();
		
		System.out.print("이름 : 이샛별");
	    System.out.println();
	    System.out.println("나이 : 30");
	    
	    System.out.println("직업 : 학생");
	    
	    System.out.println();
	    
	    // printf("문자열의 규칙", 데이터, 데이터, 데이터)
	    // 정수 : %d
	    // 문자열 : %s
	    // 실수 : %f, %e
	    
	    //문자열 저장 변수선언 : string 변수이름 = "이샛별"
	    String userName = "이샛별";
	    int age = 30;
	    float height = 157f;
	    String job = "학생";
	    
	    System.out.printf("이름 : %s, 나이 : %d, 키 : %f cm, 직업 : %s", "이샛별", 30, 157.2f, "학생" );
	    
	    System.out.println();
	    
	    System.out.printf("이름 : %s, 나이 : %d, 키 : %f cm, 직업 : %s", userName, age, height, job );
	    
	    
	    
	    
	}

}
