public class UAS {
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Andy");
	person.setNIM("064001600032");
        person.setProdi("Teknik Informatika");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("Hendra");
	// Tulis statement untuk menset NIM anda sendiri
	...;
	// Tulis statement untuk menset program studi anda
	...;
	System.out.println(mhs);
    }
}

