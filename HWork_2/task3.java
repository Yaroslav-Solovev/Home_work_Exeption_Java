package HWork_2;

import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);
    
    // Метод проверки на ввод пустой строки
    public static String getString(){
        System.out.println("Enter string: ");
        String newString = scanner.nextLine();
        newString = newString.trim();
        if(newString.isEmpty())
            throw new IllegalArgumentException("Error: Строка пустая!");
        else
            System.out.println("My string: " + newString);
        return newString;
    }

    // Исполняемая программа
    public static void main(String[] arg){
        getString();
    }
}
