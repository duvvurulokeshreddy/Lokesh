package programsforpackages;
import java.util.Scanner ;
public class WithOurLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO PROGRAMM TO GET BASE BALUES : \n==> ENTER YOUR INITIAL VALUE ");
		int ini = s.nextInt();
		System.out.println("ENTER YOUR FINAL VALUE : ");
		int fin = s.nextInt();
		baseValue(ini , fin);

	}

	static void baseValue(int ini, int fin) {
	     if(ini>fin) {
	    	 return ;
	     }
	     if(  ini%2 != 0 ) {
	    	 System.out.println(ini);
	     }
	     ini++;
	     baseValue(ini , fin );
		
	}

}
