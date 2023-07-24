package HWork_3.Core.Operations;


import java.util.ArrayList;

import HWork_3.Core.Console.ConsoleLine;
import HWork_3.Core.Data.Base;
import HWork_3.Core.Console.ConsoleData;
import HWork_3.Core.Console.ConsoleNumber;
import HWork_3.Core.Console.ConsoleGender;


public class AddPeople {
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleData consoleData = new ConsoleData();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
    public static ConsoleGender consoleGender = new ConsoleGender();
    
    public ArrayList<Base> getArrayPeople() throws Exception { //** Вывод данных о человеке по поиску */

        Base people = new Base(null, null, null, null, null, null, null);
        System.out.println("Введите следующую информацию по человеку: ");
        System.out.println("Введите фамилию: ");
        people.setSurname(consoleLine.getString());
        System.out.println("Введите имя: ");
        people.setName(consoleLine.getString());
        System.out.println("Введите отчество: ");
        people.setPatronymic(consoleLine.getString());
        System.out.println("Введите дату рождения: "); // (формат: dd.MM.yyyy)
        people.setDateBirth(consoleData.getDate());
        System.out.println("Введите гендер (f/m): ");
        people.setGender(consoleGender.getStrGender());
        System.out.println("Введите номер телефона: ");
        people.setPhoneNumber(consoleNumber.getNum());

        ArrayList<Base> allPeople = new ArrayList<Base>();
        allPeople.add(people);
        return allPeople;
    }
}
