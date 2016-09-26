package de.inex;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {	
	
	
	public static void main(String[] args) {
	long start = System.nanoTime();								//Setzten der Startzeit
	List<Long> lsCheck = new ArrayList<Long>();					//ArrayList für gesuchte Zahlen
		long sum = 0;
			for(long n = 0; n < 1000; n++) {
				if(n % 3 == 0 || n % 5 == 0 ) { 				//Alle Zahlen unter 1000 die ohen Rest durch 3||5 Teilbar sind
					lsCheck.add(n);								//Schreiben der richtigen Zahlen in Checkliste
					sum += n;									//Summenbildung der validierten Zahlen
			}
		}		System.out.println(sum);	
	long runningTime = System.nanoTime() - start;				//Berechnung der Laufzeit
	System.out.print("Laufzeit in Nanosekunden: " + runningTime);				//Print der Laufzeit
	}
}
