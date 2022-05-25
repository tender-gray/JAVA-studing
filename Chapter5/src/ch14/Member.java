package ch14;

public class Member {

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
		return memberName + "ȸ������ ���̵�� " + memberID + "�Դϴ�.";
	}
	
	
	
	
}
