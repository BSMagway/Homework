package by.itstep.issue;

public class Book extends Issue {


    private String authors;

    public Book(String name, String authors) {
        super(name);
        this.authors = authors;
    }

    @Override
    public void printName() {
        System.out.println("Name book:");
        System.out.println(getName());
    }

    public void printAuthors() {
        System.out.println("Authors: ");
        System.out.println(authors);
    }
}
