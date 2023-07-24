package HWork_3.Core.Console;

import java.util.Scanner;

public class ConsoleNumber {
    static Scanner scanner = new Scanner(System.in);
    
    public Integer getNum() throws Exception {  //** Метод проверки на ввод числа с консоли на ошибку */
        if (!scanner.hasNextInt()) {
            throw new RuntimeException("Error: Вы ввели не число!");
        }
        return scanner.nextInt();
    }
}
