import java.util.Scanner;

public class Menu {
    
    public void PrintMenu() {
        System.out.print("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Диагональ\n6 - Количество ядер процессора");
        System.out.println();
    }

    public Integer GetFilter() {
        PrintMenu();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Integer numMenu = Integer.parseInt(iScanner.nextLine());
        
        iScanner.close();
        return numMenu;
    }
}
