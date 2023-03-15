package cts.s02.principii_clean_code.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;

public class AngajatReader extends AplicantReader {

    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(fileName));
        input2.useDelimiter(",");
        List<Aplicant> aplicants = new ArrayList<Aplicant>();


        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);

            aplicants.add(angajat);
        }
        input2.close();
        return aplicants;
    }
}