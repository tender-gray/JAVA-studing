package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
	
		MemberHashMap MemberHashMap = new MemberHashMap();
		
		Member memberKim = new Member(1004, "�����");
		Member memberLee = new Member(1001, "�̻��");
		Member memberYoon = new Member(1002, "���̳�");
		Member memberLee2 = new Member(1003, "�̼���");
		
		MemberHashMap.addMember(memberLee);
		MemberHashMap.addMember(memberYoon);
		MemberHashMap.addMember(memberLee2);
		MemberHashMap.addMember(memberKim);

		MemberHashMap.showAllMember();
		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1001, "Lee");
		hashMap.put(1002, "Yoon");
		hashMap.put(1003, "Lee2");
		hashMap.put(1004, "Kim");
		
		System.out.println(hashMap);
	}

}
