package by.itstep.issue;

public class Issue {

    private String name;

        public Issue(String name) {
            this.name = name;
        }

        public void printName() {
            System.out.println("Name issue:");
            System.out.println(name);
        }

    public String getName() {
        return name;
    }
}
