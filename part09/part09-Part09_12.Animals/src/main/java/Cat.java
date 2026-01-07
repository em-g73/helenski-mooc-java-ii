public class Cat extends Animal implements NoiseCapable{
    
    private String name;
    
    public Cat(String name) {
        super(name);
        this.name = name;
    }
    
    public Cat() {
        this.name = "Dog";
    }
    
    public void purr() {
        System.out.println(name + " purrs");
    }
    
    public void makeNoise() {
        purr();
    }
}
