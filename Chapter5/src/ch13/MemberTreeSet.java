package ch13;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> TreeSet;
	
	public MemberTreeSet() {
		TreeSet = new TreeSet<>();
	}
	
	
	public void addMember(Member member) {
		TreeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
	
		Iterator<Member> ir = TreeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			if(tempId == memberID) {                          // ������̵� �Ű������� ��ġ�ϸ�
				TreeSet.remove(member);                     // �ش� ����� ����
				return true;                                  // true ��ȯ
			}
		}
			System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
			return false;
	}
			
			
		
	public void showAllMember() {
		for( Member member : TreeSet ) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
	
}
