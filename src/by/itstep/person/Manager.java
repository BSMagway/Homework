package by.itstep.person;

public class Manager extends Employee
{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void actionPerson()
    {
        System.out.println("Action person (manager) " + getName());
    }

    public void actionManager()
    {
        System.out.println("Only manager action");
    }
}
