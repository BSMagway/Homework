package by.itstep.person;

public class Employee extends Person
{


    public Employee(String name) {
        super(name);
    }

    @Override
    public void actionPerson()
    {
        System.out.println("Action person (employee) " + getName());
    }

    public void actionEmployee()
    {
        System.out.println("Only employee action");
    }
}
