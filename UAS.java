public class UAS {
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Andy");
	person.setNIM("067001700001");
        person.setProdi("Sistem Informasi");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("Sarah");
	// Tulis statement untuk menset NIM anda sendiri
	...;
	// Tulis statement untuk menset program studi anda
	...;
	System.out.println(mhs);
    }
}

