package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Name must have a value");
        }
        
        if (name.length() < 1 || name.length() > 40) {
            throw new IllegalArgumentException("Name must be between 1-40");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0-120");
        }
                
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
