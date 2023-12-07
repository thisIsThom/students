package students;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	static Grupa gr123 = new Grupa(123, "MD", "FCRI");;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adauga studenti:
		adaugaStudenti();
		//Afiseaza studenti:
		afiseazaStudenti();
		//Inroleaza studenti:
		inroleazaStudenti();
		//Afiseaza studenti:
		afiseazaStudenti();
		//Exmatriculeaza student:
		exmatriculeazaStudent("123456780");
		//Afiseaza studenti:
		afiseazaStudent("123456780");
		//Afiseaza studenti:
		afiseazaStudenti();
	}
	private static void adaugaStudenti() {
		gr123.Studenti.add(new Student("123456789", new Date(), "Str.Victoriei, nr.1", "Vasile Ion", 1, false, 123));
		gr123.Studenti.add(new Student("123456789", new Date(), "Str.Victoriei, nr.1", "Vasile Ion", 1, false, 123));
		gr123.Studenti.add(new Student("123456789", new Date(), "Str.Victoriei, nr.1", "Vasile Ion", 1, false, 123));
		gr123.Studenti.add(new Student("123456789", new Date(), "Str.Victoriei, nr.1", "Vasile Ion", 1, false, 123));
		gr123.Studenti.add(new Student("123456780", new Date(), "Str.Victoriei, nr.1", "Vasile Ion", 1, false, 123));

	}
	//afiseaza studenti!
	private static void afiseazaStudenti() {
		System.out.println("=====================================================================================================");
		System.out.println("CNP" + "\t\t" + "DATA_NASTERII" + "\t\t\t" + "ADRESA" + "\t\t\t" + "NUME_PRENUME" + '\t' + "AN" + '\t' + "STATUS");
		System.out.println("=====================================================================================================");
		System.out.println("=");
		for (Student s : gr123.Studenti) {
			System.out.println(s.CNP + '\t' + s.DataNasterii.toString() + '\t' + s.Adresa + '\t' + s.NumePrenume + '\t' + s.AnStudiu + '\t' + s.status);
			System.out.println("------------------------------------------------------------------------------------------------------");
		}
	}
	
	private static void afiseazaStudent(String cnp) {
		System.out.print("Studentul cu CNP-ul " + cnp + ", este ");
		gr123.Studenti.stream().filter(x -> x.CNP == cnp).map(x -> {x.status=false; return x.NumePrenume;}).forEach(System.out::print);
		System.out.println("!");
	}

	private static void inroleazaStudenti() {
		gr123.Studenti.stream().map(x -> {x.status=true; return x;}).collect(Collectors.toList());
		System.out.println("Studentii au fost inrolati!");
	}
	
	private static void exmatriculeazaStudent(String cnp) {
		System.out.println("ATENTIE! Studentul cu CNP-ul " + cnp + " urmeaza sa fie exmatriculat!");
		gr123.Studenti.stream().filter(x -> x.CNP == cnp).map(x -> {x.status=false; return x;}).collect(Collectors.toList());
	}
}

