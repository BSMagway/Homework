package by.itstep.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Dog " + this.getName() + " now is moving…");
    }

    public void dogAction() {
        System.out.println("Dog action");
    }
}
