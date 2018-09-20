package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        //Prueba
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1990, 9, 11);
        
        Person person = new Person("Carlos", date);
        System.out.print(person.getName() + " tiene "+ person.getAge() + " años.");
    }
    
}
