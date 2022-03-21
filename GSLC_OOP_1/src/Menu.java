import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Data> datas;
	private Scanner sc = new Scanner(System.in);

	public Menu(ArrayList<Data> datas) {
		this.datas = datas;
	}

	public void viewMenu() {
		int choice = -1;
		while(choice != 4) {
			printMenu();
			choice = sc.nextInt(); sc.nextLine();
			if(choice == 1) {
				inputData();
			}else if (choice == 2) {
				showData();
			}else if (choice == 3) {
				deleteData();
			}else if (choice == 4) {
				System.out.println("Exited Program");
			}
		}
	}
	
	public void printMenu() {
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Exit");
		System.out.print("Your Choice: ");
	}
	
	public void inputData() {
		String name = "", password = "", phone = "";
		
		while(!Data.validateName(name)) {
			System.out.print("Input your name >> ");
			name = sc.nextLine();
		}

		while(!Data.validatePassword(password)) {
			System.out.print("Input your password (use at least one capital letter) >> ");
			password = sc.nextLine();
		}

		while(!Data.validatePhone(phone)) {
			System.out.print("Input your phone number (use number only with length 10 - 12) >> ");
			phone = sc.nextLine();
		}

		datas.add(new Data(name, password, phone));
		System.out.println("New data is added");
	}
	
	public void showData() {
		System.out.println("===================================================");
		System.out.printf("|%3s| %12s| %12s| %12s|\n", "No", "Name", "Pass", "Phone");
		System.out.println("===================================================");
		
		if (datas.size() == 0) {
			System.out.println("        No Data Existed");
		} else {
			for(int i = 0; i < datas.size(); i++) {
				Data data = datas.get(i);
				System.out.printf("|%3d| %12s| %12s| %12s|\n", i+1, data.getName(), data.getPassword(),  data.getPhone());
			}
		}
		System.out.println("===================================================");
		return;
	}
	
	public  void deleteData() {
		int idx = -1;
		showData();
		while(!validIndex(idx - 1)) {
			System.out.print("Input data number to be deleted: ");
			idx = sc.nextInt(); sc.nextLine();
			if(!validIndex(idx - 1)) {
				System.out.println("Invalid index!");
			}
		}

		String confirm = "";
		while(!(confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("no"))) {
			System.out.print("Are you sure you want to delete this data? [yes | no]: ");
			confirm = sc.nextLine();
		}
		
		if(confirm.equalsIgnoreCase("no")) {
			System.out.println("Data is not removed");
			return;
		}
		
		datas.remove(idx-1);
		System.out.println("Data is removed");
	}
	
//	Validasi Index
	private boolean validIndex(int idx) {
		return idx > 0 && idx < datas.size();
	}
}
