package cts.s02.principii_clean_code.main;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {
	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReader = new cts.s02.principii_clean_code.readers.AngajatReader();
			listaAngajati = aplicantReader.readAplicants("angajati.txt");
			for (Aplicant aplicant : listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareFinantare();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}