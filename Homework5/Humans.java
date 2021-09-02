package Homework5;

public class Humans {
        String Surname;
        String Name;
        String Patronymic;
        String Position;
        String Email;
        String Phone;
        int Salary;
        int Age;
        public Humans(String Surname, String Name, String Patronymic, String Position, String Email, String Phone, int Salary, int Age) {
                this.Surname = Surname;
                this.Name = Name;
                this.Patronymic = Patronymic;
                this.Position = Position;
                this.Email = Email;
                this.Phone = Phone;
                this.Salary = Salary;
                this.Age = Age;

        }
        public int getAge() {
                return Age;
        }
}
//System.out.println(Arrays.toString(myArrayTwo));