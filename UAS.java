public class UAS {
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Kevin");
	person.setNIM("064001600007");
        person.setProdi("Teknik Informatika");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("Kevin");
	// Tulis statement untuk menset NIM anda sendiri
	...;
	// Tulis statement untuk menset program studi anda
	...;
	System.out.println(mhs);
    }
}

