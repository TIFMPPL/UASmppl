public class UAS {
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Rilo");
	person.setNIM("065001600013");
        person.setProdi("Sistem Informasi");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("Rilo");
	// Tulis statement untuk menset NIM anda sendiri
	...;
	// Tulis statement untuk menset program studi anda
	...;
	System.out.println(mhs);
    }
}

