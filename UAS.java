public class Student {
    private String name;
    private String title;
    private String address;
    private static final String NIM = null;
    String prodi;
    /**
     * Constructor to create Student object
     */
    public Student() {
    		}
    	
    

    /**
     * Constructor with parameter
     *
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Method used to print the information of person
     */
    @Override
    public String toString() {
        return "Student info [" +
                "name='" + name + "'" +
                ", student ID ='" + NIM + "'" +
                ", study programme ='" + prodi + "'" +
                "]";
    }
}

public class Person {
    private String name;
    private String title;
    private String address;

    /**
     * Constructor to create Person object
     */
    public Person() {

    }

    /**
     * Constructor with parameter
     *
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Method to get the name of person
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name of person
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the title of person
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to set the title of person
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to get address of person
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method to set the address of person
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method to get name with title of person
     *
     * @return nameTitle
     */
    public String getNameWithTitle() {
        String nameTitle;
        if (title != null) {
            nameTitle = name + ", " + title;
        } else {
            nameTitle = name;
        }
        return nameTitle;
    }

    /**
     * Method used to print the information of person
     */
    @Override
    public String toString() {
        return "Info [" +
                "name='" + name + "'" +
                ", title='" + title + "'" +
                ", address='" + address + "'" +
                "]";
    }
}

public class UAS {
	
    public static void main(String[] args) {
    
        Student person = new Student();
        person.setName("Yusuf Alvino Riondi");
	person.setNIM("064001600014");
        person.setProdi("Teknik Informatika");
        System.out.println(person);

	// Ubah 'Sarah' dengan nama anda sendiri
        Student mhs = new Student("Yusuf Alvino Riondi");
	// Tulis statement untuk menset NIM anda sendiri

	// Tulis statement untuk menset program studi anda
	...;
	System.out.println(mhs);
    }
}
