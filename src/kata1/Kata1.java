package kata1;

import java.time.LocalDate;
import java.time.Month;


public class Kata1 {

    public static void main(String[] args) {
        //Prueba
        LocalDate date;
        date = LocalDate.of(2000, Month.SEPTEMBER, 18);
     
        Person person = new Person("Carlos", date);
        System.out.print(person.getName() + " tiene "+ person.getAge() + " años.");
    }
    
}
