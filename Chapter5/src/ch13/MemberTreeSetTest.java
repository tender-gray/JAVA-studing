package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("이상용");
//		set.add("윤이나");
//		set.add("이서온");
//		
//		System.out.println(set);
		
		
		MemberTreeSet MemberTreeSet = new MemberTreeSet();
		
		Member memberKim = new Member(1004, "김순분");
		Member memberLee = new Member(1001, "이상용");
		Member memberYoon = new Member(1002, "윤이나");
		Member memberLee2 = new Member(1003, "이서온");
		
		MemberTreeSet.addMember(memberLee);
		MemberTreeSet.addMember(memberYoon);
		MemberTreeSet.addMember(memberLee2);
		MemberTreeSet.addMember(memberKim);

		MemberTreeSet.showAllMember();
		
		
		
	}

}
