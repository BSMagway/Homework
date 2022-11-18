package by.itstep.animal;

public class PetDog extends Dog {

    public PetDog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Pet dog " + this.getName() + " now is moving…");
    }

    public void petDogAction() {
        System.out.println("Pet dog action");
    }
}
