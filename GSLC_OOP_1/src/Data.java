
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
		return phone.matches("[0-9]{10,12}"); //check hanya angka
	}

	public static boolean validatePassword(String password) {
		if(password.length() < 5) 
			return false;
		
		if(password.contains(" "))
			return false;
		
		char[] arr = password.toCharArray();
		for (int i = 0; i < arr.length; i++) 
			if(Character.isUpperCase(arr[i])) 
				return true;

		return false;
	}

	public static boolean validateName(String name) {
		return name.matches("[a-zA-Z]+");
	}	
}
