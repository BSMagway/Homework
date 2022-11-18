package by.itstep.issue;

public class Newspaper extends Issue{

    private String date;

    public Newspaper(String name, String date) {
        super(name);
        this.date = date;
    }

    @Override
    public void printName() {
        System.out.println("Name newspaper:");
        System.out.println(getName());
    }

    public void printDate() {
        System.out.println("Date: ");
        System.out.println(date);
    }
}
