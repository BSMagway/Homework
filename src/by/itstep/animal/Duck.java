package by.itstep.animal;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Duck " + this.getName() + " now is moving…");
    }

    public void duckAction() {
        System.out.println("Duck action");
    }
}
