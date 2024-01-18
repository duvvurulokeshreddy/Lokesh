package numbers;

import java.text.NumberFormat;
import java.util.Currency;

public class Zero {
	public static void main(String[] args) {
		int number = 123;
		//System.out.format("%03d", number);
		double a = 98065.90 ;
		 NumberFormat obj = NumberFormat.getCurrencyInstance();
	    Currency st = obj.getCurrency();
	    st.getSymbol();
	   System.out.println(st);
	   char c = 'd';
	}
}
