package readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader implements AplicantReader{
    public static List<Aplicant> readStudents(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            String nume = input.next();
            String prenume = (input.next()).toString();
            int varsta = Integer.valueOf(input.nextInt());
            int punctaj = Integer.valueOf(input.nextInt());
            int nr = Integer.valueOf(input.nextInt());
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input.next();
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }

    @Override
    public List<Aplicant> readAplicant(String fileName) {
        return null;
    }
}
