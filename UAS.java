public class UAS {
    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Dwiky");
	person.setNIM("064001600018");
        person.setProdi("Teknik Informatika");
        System.out.println(person);

	
        Student mhs = new Student("Dwiky");
	
	
	System.out.println(mhs);
    }
}

