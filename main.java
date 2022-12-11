// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Вывести в виде.
// |Имя| Критерий|
// |----|-----------|
// | Asus | 2ГБ |
// | HP | 4ГБ |
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
// (По возрастанию имени ноутбука в алфавитном порядке, по цене по убыванию)
public class main {
    public static void main(String[] args) {

        Notebook[] notebook = CreateNotebook();
        Menu menu = new Menu();
        menu.GetFilter();
        
        
    }
    public static Notebook[] CreateNotebook() {
        Notebook[] arrNotebooks = new Notebook[]{
            new Notebook("MSI", 16, 512,
                "Windows10", "black", 15.6, 8),
            new Notebook("Aser", 2, 512,
                "Windows7", "black", 11.6, 2),
            new Notebook("Asus", 8, 1024,
                "Windows11", "grey", 17.0, 8),
            new Notebook("MSI", 8, 512,
                "---", "black", 15.6, 4),
        };
        return arrNotebooks;
    }
    public static void printArr(Notebook[] arr) {
        for (Notebook el : arr) {
            el.PrintInfo();
            System.out.println();
        }
    }
}