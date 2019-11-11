package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innlegg;
	private int nesteledig;
	
	public Blogg() {
		this.innlegg = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		
		this.innlegg = new Innlegg[lengde];

	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innlegg;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int a = -1;
		int i = 0;
			while(i < nesteledig && a == -1 ){
				if(this.innlegg[i].erLik(innlegg)) {
					a = i; 
				}
			i++;
			}
		return a;
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean a = false;
		int i = 0;
			while(i < nesteledig && a == false){
				if(this.innlegg[i].erLik(innlegg)) {
					a = true; 
				}
			i++;
			}
		return a;
	}

	public boolean ledigPlass() {
		boolean a = false;
		int i = 0;
			while(i < innlegg.length && !a){
				if(innlegg[i] == null) {
					a = true; 
				}
			i++;
			}
		
		return a;

	}
	
	public boolean leggTil(Innlegg innlegg) {
	
		
				if(!finnes(innlegg) ) {
					this.innlegg[nesteledig] = innlegg;
					nesteledig++;
					return true;
				}	
				else {
					return false;
				}
	}
	
	public String toString() {
		String a = (getAntall() + "\n");
		for(int i = 0; i < nesteledig; i++) {
			if (innlegg[i] != null) {
				a += innlegg[i].toString();
			}
		}
		return a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}