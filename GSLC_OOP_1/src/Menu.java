import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static String nama;
	static String pass;
	static String num;
	static Scanner sc = new Scanner(System.in);
	static boolean valPhone;
	static boolean valPass;
	static boolean valName;
	
	public static void printMenu() {
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Exit Data");
		System.out.print("Your Choice: ");
	}
	
	public static void inputData(ArrayList<Data> datas) {
		do {
			System.out.print("Input your name >> ");
			nama = sc.nextLine();
			System.out.print("Input your password (use at least one capital letter) >> ");
			pass = sc.nextLine();
			System.out.print("Input your phone number (use number only with length 10 - 12) >> ");
			num = sc.nextLine();
			valPhone = Data.validatePhone(num);
			valName = Data.validateName(nama);
			valPass = Data.validatePassword(pass);
		}while(valPhone == false || valName == false || valPass == false);
		datas.add(new Data(nama,pass,num));
		System.out.println("New data is added");
	}
	
	public static void showData(ArrayList<Data> datas) {
		System.out.println("===================================================");
		System.out.printf("|%3s| %12s| %12s| %12s|\n", "No", "Name", "Pass", "Phone");
		System.out.println("===================================================");
		
		if (datas.size() == 0) {
			System.out.println("        No Data Existed");
		}else {
			for(int i = 0; i < datas.size(); i++) {//keknya harus di bikin pake printF
			//System.out.println(i+1 + "   " + datas.get(i).getName()+ "   "+
			//datas.get(i).getPassword()+ "   " +  datas.get(i).getPhone());
				System.out.printf("|%3d| %12s| %12s| %12s|\n", i+1, datas.get(i).getName(), datas.get(i).getPassword(),  datas.get(i).getPhone());
			}// kalo mo dibikin printData di class Data bisa sih, biar nanti tinggal datas.get(i).printData()
		}
		System.out.println("===================================================");
		return;
	}
	
	public static void deleteData(ArrayList<Data> datas) {
		int idx = -1;
		showData(datas);
		while(!validIndex(idx, datas)) {
			System.out.print("Input data number to be deleted: ");
			idx = sc.nextInt(); sc.nextLine();
			if(!validIndex(idx, datas)) {
				System.out.println("Invalid index!");
			}
		}
		datas.remove(idx-1);
		System.out.println("Data is removed");
		return;
	}
	
//	Validasi Index
	private static boolean validIndex(int idx, ArrayList<Data> datas) {
		if(idx < 0 || idx > datas.size()) {
			return false;
		}
		return true;
	}
	

	
}
