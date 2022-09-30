package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.PhoneImpl;

public class GenericMethodByType {
	
	public <T> void hello(T t) {
		System.out.println("안녕하세요. " + t.toString() + " 입니다.");
		
	}
	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
//		byType.<String>hello("안유진");
//		byType.hello(10);
//		byType.<PhoneImpl>hello(new PhoneImpl());
		byType.hello(new PhoneImpl());
		
	}

}
