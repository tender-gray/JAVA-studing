package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "�̻��");
		Member memberYoon = new Member(1002, "���̳�");
		Member memberKim = new Member(1003, "�赿��");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberKim);

		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim.getMemberID());
		
		
		memberArrayList.showAllMember();
		
	}

}
