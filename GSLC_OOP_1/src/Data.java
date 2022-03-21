
public class Data {
	private String name;
	private String password;
	private String phone;
	
//	Constructor
	public Data(String name, String password, String phone) {
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
	public static boolean validatePhone(String phone) {
		if(phone.length() < 10 && phone.length() > 12)return false; //check panjang nomor hp
		if(!phone.matches("[0-9]+")) return false; //check hanya angka
		return true;
	}

	public static boolean validatePassword(String password) {
		if(password.length() < 5) {
			return false;
		}
		else if(password.contains(" ")){
			return false;
		}
		else {
			char [] arr = password.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if(Character.isUpperCase(arr[i])) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean validateName(String name) {
			if(name.matches("[a-zA-Z]+") == false) {
				return false;
			}
			return true;
	}	
}
