class Student extends Person
{
    private String NIM;    // student ID number

    /**
     * Create a student with default settings for detail information.
     */

    Student() {
    	super("(unknown name)", 0000);
    	NIM = "(unknown ID)";
    }
    
/*public Student() {

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

