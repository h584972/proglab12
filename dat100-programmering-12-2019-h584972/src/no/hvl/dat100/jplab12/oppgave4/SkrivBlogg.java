package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		
		boolean a = false;
		PrintWriter skriver = null; 
		try {
			skriver = new PrintWriter(filnavn);
        	skriver.println(samling.toString());
        	a = true;
        	
		}catch(FileNotFoundException e) {
			
			System.out.println("noe er galt....");
			
		}
		
		finally {
			skriver.close(); 
		}
		
        return a;
	}
	
}
