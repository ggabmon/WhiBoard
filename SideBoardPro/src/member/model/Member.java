package member.model;

public class Member {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_birth;
	private String user_tlno;
	private String user_joindate;
	private String user_nickname;
	private String user_gender;
	
	public Member(String user_id, String user_pw, String user_name, String user_birth, String user_tlno,
			String user_joindate, String user_nickname, String user_gender) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.user_tlno = user_tlno;
		this.user_joindate = user_joindate;
		this.user_nickname = user_nickname;
		this.user_gender = user_gender;
	}
	public Member(String user_id, String user_pw, String user_name, String user_birth, String user_tlno, String user_nickname, String user_gender) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.user_tlno = user_tlno;
		this.user_nickname = user_nickname;
		this.user_gender = user_gender;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public String getUser_tlno() {
		return user_tlno;
	}

	public String getUser_joindate() {
		return user_joindate;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public String getUser_gender() {
		return user_gender;
	}

	@Override
	public String toString() {
		return "Member [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_birth="
				+ user_birth + ", user_tlno=" + user_tlno + ", user_joindate=" + user_joindate + ", user_nickname="
				+ user_nickname + ", user_gender=" + user_gender + "]";
	}
	
	
}


