package HWork_3.Core.Console;

import java.util.Scanner;

public class ConsoleGender {
    static Scanner scanner = new Scanner(System.in);
    public static ConsoleLine consoleLine = new ConsoleLine();

    public String getStrGender() throws Exception { //** Метод проверки на ввод Gender (f/m) */
        String strGender = scanner.nextLine();
        if(!strGender.equals("f") && !strGender.equals("m")){
            throw new Error("Error: Вы ввели неверное значение!");
        }
        return strGender;
    }
}
