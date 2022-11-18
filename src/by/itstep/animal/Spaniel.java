package by.itstep.animal;

public class Spaniel extends Dog {

    public Spaniel(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Spaniel " + this.getName() + " now is moving…");
    }

    public void spanielAction() {
        System.out.println("Spaniel action");
    }
}
