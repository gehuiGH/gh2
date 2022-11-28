package dto;

public class User_1 {
	private String username;
	private String possword;
	private String email;
	private String name;
	private String phone;
	public User_1() {}
	public User_1(String username, String possword, String email, String name, String phone) {
		super();
		this.username = username;
		this.possword = possword;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPossword() {
		return possword;
	}
	public void setPossword(String possword) {
		this.possword = possword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
