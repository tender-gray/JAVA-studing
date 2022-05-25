package ch11;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "ÀÌ»ó¿ë");
		Member memberYoon = new Member(1002, "À±ÀÌ³ª");
		Member memberKim = new Member(1003, "±èµ¿Áø");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberKim);

		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim.getMemberID());
		
		
		memberArrayList.showAllMember();
		
	}

}
