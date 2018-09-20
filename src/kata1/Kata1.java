package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Carlos", new Date(98,11,14));
        System.out.print(person.getName() + " tiene "+ person.getAge());
    }
    
}
