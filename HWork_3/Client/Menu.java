package HWork_3.Client;
import HWork_3.Core.Views.View;
import HWork_3.Core.Console.ConsoleView;
import HWork_3.Core.Operations.AddPeople;
import HWork_3.Core.Operations.FileSafe;

public class Menu {
    
    public static AddPeople addPeople = new AddPeople();

    View ui;

    public Menu() {
        ui = new ConsoleView();
    }
    
    public void start() throws Exception {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Добавление человека и создание файла\n")
                .append("0 - exit\n");
        
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    FileSafe.fileSafe();
                    break;
                case "0":
                    return;
                default:
                    return;
            }   
        }
    }
}
