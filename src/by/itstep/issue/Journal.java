package by.itstep.issue;

public class Journal extends Issue{

    private String month;

    public Journal(String name, String month) {
        super(name);
        this.month = month;
    }

    @Override
    public void printName() {
        System.out.println("Name journal:");
        System.out.println(getName());
    }

    public void printMonth() {
        System.out.println("Month: ");
        System.out.println(month);
    }
}
