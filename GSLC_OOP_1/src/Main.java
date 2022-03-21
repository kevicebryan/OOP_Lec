import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Data> datas = new ArrayList<Data>();
		datas.add(new Data("WIlliam", "hello", "081231313344"));
		datas.add(new Data("Kevin", "goodbye", "081111111111"));
		
		Menu menu = new Menu(datas);
		menu.viewMenu();
	}
}
//@Anggota:
// - @KevinBryan
// - @OliverChico
// - @Ryanto
// - @WendyOei
