import by.itstep.StringHomework.StringHomework;
import by.itstep.animal.*;
import by.itstep.issue.Book;
import by.itstep.issue.Issue;
import by.itstep.issue.Journal;
import by.itstep.issue.Newspaper;
import by.itstep.person.Clerk;
import by.itstep.person.Employee;
import by.itstep.person.Manager;
import by.itstep.person.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Test string from letters in input string");
        System.out.println(StringHomework.wordsFromLetters("dshbd    njcn  qlnme    cjna"));

        System.out.println("Test upcasting and downcasting: ");
        System.out.println("Animal farm: ");

        ArrayList<Animal> animalFarm = new ArrayList<>();
        animalFarm.add(new Dog("dog1"));
        animalFarm.add(new Cat("cat1"));
        animalFarm.add(new Duck("duck1"));
        animalFarm.add(new PetDog("petdog1"));
        animalFarm.add(new Spaniel("spaniel"));

        for (Animal animal : animalFarm)
        {
            animal.move();

            if (animal instanceof Cat)
            {
                ((Cat) animal).catAction();
            } else if (animal instanceof  Duck)
            {
                ((Duck) animal).duckAction();
            } else if (animal instanceof Dog)
            {
                if (animal instanceof PetDog)
                {
                    ((PetDog) animal).petDogAction();
                } else if (animal instanceof Spaniel) {
                    ((Spaniel) animal).spanielAction();
                } else
                {
                    ((Dog)animal).dogAction();
                }
            }
        }

        System.out.println("Person in firm: ");
        ArrayList<Person> personFirm = new ArrayList<>();
        personFirm.add(new Employee("employee1"));
        personFirm.add(new Manager("manager1"));
        personFirm.add(new Clerk("clerk1"));

        for (Person person : personFirm)
        {
            person.actionPerson();

            if (person.getClass() == Manager.class)
            {
                ((Manager)person).actionManager();

            }
            else if (person.getClass() == Clerk.class)
            {
                ((Clerk)person).actionClerk();
            }
            else if (person instanceof Employee)
            {
                ((Employee) person).actionEmployee();
            }
        }

        System.out.println("Issue: ");
        ArrayList<Issue> issues = new ArrayList<>();
        issues.add(new Book("book1", "authors1"));
        issues.add(new Journal("journal1", "june"));
        issues.add(new Newspaper("Times", "10.10.10"));

        for (Issue issue : issues)
        {
            issue.printName();

            if (issue instanceof Book)
            {
                ((Book) issue).printAuthors();
            } else if (issue instanceof Journal) {
                ((Journal) issue).printMonth();
            } else if (issue instanceof  Newspaper) {
                ((Newspaper) issue).printDate();
            }
        }

    }
}