package algorithms.inversions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import algorithms.sort.ArrayUtils;

public class Quiz {

	public int[] getArray( ) {
		List<Integer> numbers = new ArrayList<Integer>();
		String filepath = 
				"C:\\Users\\david\\eclipse-workspace\\alg\\algorithms\\data\\numbers.txt";
		String line;
		try {
			BufferedReader in = new BufferedReader(new FileReader(filepath));
			
			line = in.readLine();
			numbers.add(Integer.parseInt(line));
			while(line != null) {
				
				line = in.readLine();
				if (line != null) {
				  numbers.add(Integer.parseInt(line));
				}
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int integers[] = new int[numbers.size()];
		for(int i = 0; i < numbers.size(); i++) {
		  integers[i] = numbers.get(i);	
		}
		
		
		return integers;
		
		
		
	}
	public static void main(String[] args) {
		Quiz q = new Quiz();
		int numbers[] = q.getArray();
		InversionCount ic = new InversionCount();
		ic.inversionCount(numbers,0, numbers.length -1);
		InversionCount.printArray(numbers);
		System.out.println("Inversion Count: " + ic.inversionCount);
	}

}

