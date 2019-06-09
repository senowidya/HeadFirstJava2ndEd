public class PhraseOMatic {
	public static void main (String [] args) {
		
		String[] wordListOne = {"kuda", "kambing", "burung", "sapi", "ikan"};
		String[] wordListTwo = {"Bambu", "meranti", "sengon", "jati"};
		String[] wordListThree = {"piring", "gelas", "sendok", "pisau"};
		
		int oneLenght = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String paragraf = (int) (Math.random()*10)+ " " + wordListTwo [rand2]+ " " + wordListThree [rand3];
		System.out.println ("what we need is a " + paragraf);
}}