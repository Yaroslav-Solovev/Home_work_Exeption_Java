package HWork_3.Core.Console;

import java.util.Scanner;

public class ConsoleNumber {
    static Scanner scanner = new Scanner(System.in);
    
    public Integer getNum() throws Exception {  //** Метод проверки на ввод числа с консоли на ошибку */
        Integer number = scanner.nextInt();
        if (hasNextInt(number) == true || number <= 0) {
            throw new RuntimeException("Error: Не верно введены данные!");
        }
        return number;
    }

    private boolean hasNextInt(Integer number) {
        return false;
    }
}
