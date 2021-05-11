package br.com.talthur.newyearchaos;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {

	public static void main(String[] args) {

		List<Integer> rollerCoaster = new ArrayList<Integer>();
		rollerCoaster.add(2);
		rollerCoaster.add(5);
		rollerCoaster.add(1);
		rollerCoaster.add(3);
		rollerCoaster.add(4);

		minimumBribes(rollerCoaster);
	}

	public static void minimumBribes(List<Integer> q) {

		
		int bribes = 0;
		
		int first = 1;
		int second = 2;
		int third = 3;
		
		for (int number : q) {
			
			if(number == first) {
				first = second;
				second = third;
				third++;
			}
			
			else if(number == second) {
				bribes ++;
				second = third;
				third ++;
				
			}
			
			else if(number == third) {
				bribes += 2;
				third ++;
			}
			
			else {
				System.out.println("Too chaotic");
				return;
			}	
		}
		
		System.out.println(bribes);
		
	}	
}
