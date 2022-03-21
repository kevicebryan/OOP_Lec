
public class Data {
	private String name;
	private String password;
	private String phone;
	
//	Constructor
	public Data(String name, String password, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	
//	Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

//	Setter
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	Validation
	public boolean validatePhone(String phone) {
		if(phone.length() < 10 && phone.length() > 12)return false; //check panjang nomor hp
		if(!phone.matches("[0-9]+")) return false; //check hanya angka
		return true;
	}
	
	
}
