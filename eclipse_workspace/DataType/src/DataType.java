
public class DataType {

	
//	int x = 34.5;
//	boolean boo = x;
	int g = 17;
	int y = 9;
//	y = y + 10;
	short a;
//	a=y;
	byte b = 3;
	byte v = b;
	short n = 12;
//	v=n;
	byte k = -3;
	
	void aww () {
		
		
		while (true) {
			System.out.println(k);
			k = (byte) (k + 1) ;
			
			if(k==128) {
				System.out.println("Break");
				break;
			}
		}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataType hihi = new DataType();
		hihi.aww();
		
		

	}

}
 

class data {

}