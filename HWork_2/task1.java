package HWork_2;

import java.util.Scanner;

public class task1 {
    static Scanner scanner = new Scanner(System.in);

    // Метод проверки ввода ткста вместо числа
    public static Float getNumber(){
        System.out.println("Enter number: ");
        float number = 0;
        try{
            scanner.hasNextFloat();
            number = scanner.nextFloat();
        } catch (RuntimeException e){
            System.err.println("Error: Вы ввели не число! Попробуйте еще раз.");
            scanner.next();
            number = getNumber();
        } 
        return number;
    }

    // Исполняемая программа
    public static void main(String[] args){
        float number = getNumber();
        System.out.println("Вы ввели число: " + number);
    }
}
