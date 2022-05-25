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
			if(tempId == memberID) {                          // 멤버아이디가 매개변수와 일치하면
				TreeSet.remove(member);                     // 해당 멤버를 삭제
				return true;                                  // true 반환
			}
		}
			System.out.println(memberID + "가 존재하지 않습니다.");
			return false;
	}
			
			
		
	public void showAllMember() {
		for( Member member : TreeSet ) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
	
}
