package by.itstep.person;

public class Clerk extends Employee
{
    public Clerk(String name) {
        super(name);
    }

    @Override
    public void actionPerson()
    {
        System.out.println("Action person (Clerk) " + getName());
    }

    public void actionClerk()
    {
        System.out.println("Only clerk action");
    }
}
