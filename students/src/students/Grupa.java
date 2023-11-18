package students;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
int Nr;
String Specializare;
String Facultate;
public List<Student> Studenti;
public Grupa(int nr, String specializare, String facultate) {
	super();
	Nr = nr;
	Specializare = specializare;
	Facultate = facultate;
	Studenti = new ArrayList<Student>();
}

}
