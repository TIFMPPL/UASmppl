
public class Student {
    private String name;
    private String title;
    private String address;

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

