package ch13;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		try {
			while((i = System.in.read()) != '\n') {
				
			
			// System.out.println(i);
			System.out.println((char)i);
			}
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}

}
