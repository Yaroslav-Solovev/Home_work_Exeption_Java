package HWork_3.Client;

import HWork_3.Core.Console.ConsoleView;

public class Program {
    public static ConsoleView enterConsoleLine = new ConsoleView();

    public static void main(String[] args) throws Exception {
        new Menu().start();
    }
}
