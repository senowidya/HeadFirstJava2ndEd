public class minuman{
public static void main (String[] args){
int beerNum = 9999;
String word = "botol akeh";

while (beerNum > 0) {
	if (beerNum == 1){
		word = "botol titik";
	}
	
	System.out.println(beerNum + " " + word + "minum di jejer");
	System.out.println(beerNum + " " + word + "minuman silahkan ambil");
	System.out.println("ambil satu");
	beerNum = beerNum - 1;
	
	if (beerNum > 0) {
		System.out.println("ayo masih banyak minuman");
	}
	else {System.out.println("minuman telas");
	
}}}}
	