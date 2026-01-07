public class Dog extends Animal implements NoiseCapable{
    
    private String name;
    
    public Dog(String name) {
        super(name);
        this.name = name;
    }
    
    public Dog() {
        this.name = "Dog";
    }
    
    public void bark() {
        System.out.println(name + " barks");
    }

    public void makeNoise() {
        bark();
    }
}
