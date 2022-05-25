package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> HashSet;
	
	public MemberHashSet() {
		HashSet = new HashSet<>();
	}
	

	
	public void addMember(Member member) {
		HashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberID();
//			if(tempId == memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
//		
//		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
//		return false;
//	}
	
		Iterator<Member> ir = HashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			if(tempId == memberID) {                          // ������̵� �Ű������� ��ġ�ϸ�
				HashSet.remove(member);                     // �ش� ����� ����
				return true;                                  // true ��ȯ
			}
		}
			System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
			return false;
	}
			
			
		
	public void showAllMember() {
		for( Member member : HashSet ) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
	
}
