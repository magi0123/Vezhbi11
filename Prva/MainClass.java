package Prva;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		Datoteka d = new Datoteka("file.txt");
		d.zapishi("Tekst");
		d.prochitaj();
	}
}
