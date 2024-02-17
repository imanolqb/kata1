package software.ulpgc.kata1;

import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Carlos", LocalDate.of(2003,2,9));
        System.out.println("La persona creada se llama "+ person.getName()+ " con edad de " + person.getYears());
    }
}
