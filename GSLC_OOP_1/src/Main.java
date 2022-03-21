import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Data> datas = new ArrayList<Data>();
//		Dummy Datas:
		datas.add(new Data("WIlliam", "hello", "081231313344"));
		datas.add(new Data("Kevin", "goodbye", "081111111111"));
		
		int choice = 1;
		while(choice != 4) {
			Menu.printMenu();
			choice = sc.nextInt();sc.nextLine();
			if(choice == 1) {
				Menu.inputData(datas);
			}else if (choice == 2) {
				Menu.showData(datas);
			}else if (choice == 3) {
				Menu.deleteData(datas);
			}else {
				System.out.println("Exited Program");
			}
			
		}
	}

}


//@Anggota:
// - @KevinBryan
// - @OliverChico
// - @Ryanto
// - @WendyOei
