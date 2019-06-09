public class loop1 {

	public static void main (String[] args) 
	throws InterruptedException
	{
		int x = 1;
		System.out.println("Before loop");
		while (x<4){
		System.out.println("in the Loop");
		System.out.println("Value of X is " + x);
		x = x+1;
	    Thread.sleep(1000);
	}
		System.out.println("this is after loop");
	
		            }
		}