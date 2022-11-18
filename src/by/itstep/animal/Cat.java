package by.itstep.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Cat " + this.getName() + " now is moving…");
    }

    public void catAction() {
        System.out.println("Cat action");
    }


}
