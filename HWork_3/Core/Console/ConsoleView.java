package HWork_3.Core.Console;

import java.util.Scanner;
import HWork_3.Core.Views.View;

public class ConsoleView implements View{
    
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}