package ch13;

public class Member implements Comparable<Member>{

	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

		
	
	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if( this.memberID == member.memberID) {
				return true;
			}
			else return false;
		}
		return false;
	}

	
	
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public int compareTo(Member member) {
		
		if( this.memberID > member.memberID )
			return -1;
		else if( this.memberID < member.memberID )
			return 1;
		else return 0;
		
//		return ( this.memberID - member.memberID );  이렇게 해도 된다. 내림차순 하고 싶으면  *(-1) 해주면 된다.
	}
	
	
	
	
}
