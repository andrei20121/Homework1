package Homework5;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        System.out.println("*************************************************");

        Humans human = new Humans("Pinzari", "Andrei", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 25);
        System.out.println("My name " + human.Surname + " " + human.Name + " " + human.Patronymic + ". I am working " + human.Position + ". My contact details: " + human.Email + ", " +
                human.Phone  + ". My salary " + human.Salary + ". I'm " + human.Age + " years old.");

        System.out.println("*************************************************");

        Humans[] persArray = new Humans[5];
        persArray[0] = new Humans("Pinzari", "Andrei", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 25);
        persArray[1] = new Humans("Ivanov", "Ivan", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 85);
        persArray[2] = new Humans("Ivan", "Ivanov", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 75);
        persArray[3] = new Humans("Iva", "Ivanka", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 95);
        persArray[4] = new Humans("loza", "loki", "Olegovich", "Tester", "pinzari-andrei@mail.ru", "+7(965)-01-23-456", 20000, 45);

        for (Humans person : persArray)
            if (person.getAge()>40)
                System.out.println(person);

    }

}
