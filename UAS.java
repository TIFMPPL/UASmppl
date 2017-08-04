import java.util.ArrayList;
import java.util.Iterator;

public class UAS {
	
	private ArrayList persons;

    public UAS() {
        persons = new ArrayList();
    }


    public void addPerson(Person p) {
        persons.add(p);
    }

    public void listAll () {
        for (Iterator i = persons.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
	
	
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Andy");
        person.setNIM("067001700001");
        person.setProdi("Sistem Informasi");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("iqbal");
	// Tulis statement untuk menset NIM anda sendiri
	//...;
	// Tulis statement untuk menset program studi anda
	//...;
	//System.out.println(mhs);
    }
}

