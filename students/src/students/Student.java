package students;

import java.util.Date;

public class Student extends Persoana {
	int AnStudiu;
	boolean status;
	int Grupa;
	public Student(String cNP, Date dataNasterii, String adresa, String numePrenume, int anStudiu, boolean status,
			int grupa) {
		super(cNP, dataNasterii, adresa, numePrenume);
		AnStudiu = anStudiu;
		this.status = status;
		Grupa = grupa;
	}



}
