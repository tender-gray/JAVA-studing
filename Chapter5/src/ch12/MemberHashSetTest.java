package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet MemberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이상용");
		Member memberYoon = new Member(1002, "윤이나");
		Member memberKim = new Member(1003, "김동진");
		
		MemberHashSet.addMember(memberLee);
		MemberHashSet.addMember(memberYoon);
		MemberHashSet.addMember(memberKim);

		MemberHashSet.showAllMember();
		
		Member memberLee2 = new Member(1003, "이서온");
		MemberHashSet.addMember(memberLee2);
		
		
		MemberHashSet.showAllMember();

		
	}

}
