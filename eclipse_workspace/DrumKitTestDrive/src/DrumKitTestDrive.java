class DrumKitTestDrive {	
public static void main (String[] args) {
	
	Drumkit d = new Drumkit();
	
	d.playSnare();
	d.playTopHat();	
	d.snare = false;
	
	if(d.snare == true) {

		d.playSnare();
		}
}
}


class Drumkit {
	
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
	
}







