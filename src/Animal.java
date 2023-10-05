import java.util.Objects;

public class Animal {
    private  String family;
    String name;
    private  int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;

    }


    @Override
    public boolean equals(Object o) {
    // Check if the objects are identical (same memory reference)
    if (this == o) return true;
    
    // Check if 'o' is null or not an instance of the same class
    if (o == null || getClass() != o.getClass()) return false;
    
    // Cast 'o' to an 'Animal' object
    Animal animal = (Animal) o;
    
    // Compare the attributes of 'this' and 'animal' for equality
    return age == animal.age &&
           isMammal == animal.isMammal &&
           Objects.equals(family, animal.family) &&
           Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
