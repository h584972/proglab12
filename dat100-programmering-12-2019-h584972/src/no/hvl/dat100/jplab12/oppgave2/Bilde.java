package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	String Url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id,bruker,dato, tekst);
		this.Url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id , bruker, dato, likes, tekst);
		this.Url = url;
	}
	
	public String getUrl() {
		return Url;

	}

	public void setUrl(String url) {
		this.Url = url;
	}

	@Override
	public String toString() {
		String a = "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + Url + "\n";
		return a;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
