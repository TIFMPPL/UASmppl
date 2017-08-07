public class Person {
  Public static void main (String[]args){
    private String name;
    private String title;
	private String address;
   

    public Person() {
    }

    public Person(String newName, String newTitle, String newAddress){
        name = newName;
        title= newTitle;
        address = newAddress;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getTitle(){
        return title;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public String getAddress(){
        return address;
    }

 

    public String toString() {
        return "Info [" +
                "name='" + name + "'" +
                ", title='" + title + "'" +
                ", address='" + address + "'" +
                "]";
    }
    }
 }
}