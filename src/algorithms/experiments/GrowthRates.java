package algorithms.experiments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GrowthRates {

	public int log2(double n) {
		return (int)(Math.log(n) / Math.log(2));
	}
	class Rate {
		public Rate(String letter, Double value) {
			this.letter = letter;
			this.value = value;
		}
		
		public String toString() {
			return "( " + letter + " " + value + ")";
		}
		public String letter;
		public Double value;
	}
	
	public void rates() {
      
		List<Rate> rates = new ArrayList<Rate>();
		
		int N = 200;
		
		double a = Math.pow(N,2) * log2(N);
        //show("a",a);
        rates.add(new Rate("a",a));
        
        double b = Math.pow(2,N);
        //show("b",b);
        rates.add(new Rate("b",b));
        
        double c1 = Math.pow(2,N);
        double c = Math.pow( 2,c1);
        //show("c",c);
        rates.add(new Rate("c",c));
        
        double d1 = log2(N);
        double d = Math.pow(N, d1);        
       // show("d",d);
        rates.add(new Rate("d",d));
        
        double e = Math.pow(N, 2);
       // show("e",e);
        rates.add(new Rate("e",e));
        
        Collections.sort(rates, new CustomComparator());
        for(Rate r: rates) {
        	System.out.println(r);
        }
        
	}
	
	private void show(String letter, double n) {
		System.out.println(letter + ": " + n);
	}
	
	public static void main(String[] args) {
		new GrowthRates().rates();
	}
	
	class CustomComparator implements Comparator<Rate> {
	    @Override
	    public int compare(Rate o1, Rate o2) {
	        return o1.value.compareTo(o2.value);
	    }
	}

}
