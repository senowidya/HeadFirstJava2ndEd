
public class TapeDeck {

	boolean canRecord = false;
<<<<<<< HEAD
	int x = 3;
=======
	int x = 1;
>>>>>>> branch 'master' of https://github.com/senowidya/HeadFirstJava2ndEd.git
	
	void playTape() {
		System.out.println("tape playing");
	}
	
	void recordTape() {
		System.out.println("tape recording");
	}
}
class TapeDeckTestDrive{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TapeDeck t = new TapeDeck();
		t.canRecord=true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
		
	}

}
