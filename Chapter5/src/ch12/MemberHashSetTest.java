package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet MemberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̻��");
		Member memberYoon = new Member(1002, "���̳�");
		Member memberKim = new Member(1003, "�赿��");
		
		MemberHashSet.addMember(memberLee);
		MemberHashSet.addMember(memberYoon);
		MemberHashSet.addMember(memberKim);

		MemberHashSet.showAllMember();
		
		Member memberLee2 = new Member(1003, "�̼���");
		MemberHashSet.addMember(memberLee2);
		
		
		MemberHashSet.showAllMember();

		
	}

}
