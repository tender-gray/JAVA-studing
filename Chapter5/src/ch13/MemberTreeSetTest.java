package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("�̻��");
//		set.add("���̳�");
//		set.add("�̼���");
//		
//		System.out.println(set);
		
		
		MemberTreeSet MemberTreeSet = new MemberTreeSet();
		
		Member memberKim = new Member(1004, "�����");
		Member memberLee = new Member(1001, "�̻��");
		Member memberYoon = new Member(1002, "���̳�");
		Member memberLee2 = new Member(1003, "�̼���");
		
		MemberTreeSet.addMember(memberLee);
		MemberTreeSet.addMember(memberYoon);
		MemberTreeSet.addMember(memberLee2);
		MemberTreeSet.addMember(memberKim);

		MemberTreeSet.showAllMember();
		
		
		
	}

}
