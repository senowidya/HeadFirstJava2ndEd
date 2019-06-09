class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("playing the movie");
	}
	
}

public class MovieTestDrive {
	public static void main (String[] args){
		
		Movie one = new Movie();
		one.title = "Ironman";
		one.genre = "science fiction";
		one.rating = 5;
		
		Movie two = new Movie();
		two.title = "bohemian Rhapsody";
		two.rating = 4;
		two.genre = "Drama";
		two.playIt();
		
		Movie three = new Movie();
		three.title = "lincoln";
		three.genre = "Biography";
		three.rating = 4;
	}
}