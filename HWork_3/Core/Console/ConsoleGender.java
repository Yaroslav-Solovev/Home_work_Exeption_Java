package HWork_3.Core.Console;

import java.util.Scanner;

public class ConsoleGender {
    static Scanner scanner = new Scanner(System.in);
    public static ConsoleLine consoleLine = new ConsoleLine();

    public String getStrGender() throws Exception { //** Метод проверки на ввод Gender (f/m) */
        String strGender = consoleLine.getString();
        if(strGender != "f" || strGender != "m"){
            throw new IllegalArgumentException("Error: Неверно ввели значение!");
        }
        return strGender;
    }
}
