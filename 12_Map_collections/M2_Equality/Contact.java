import java.util.Objects;

public class Contact {

    private String name;
    private int age;

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if (!(obj instanceof Contact)){
            return false;
        } else {
            Contact contact = (Contact) obj;
            return (name.equals(contact.getName())) &&
                (age == contact.getAge());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
