public class Notebook {
    String nameNotebook; // Наименование
    Integer RAM; // ОЗУ
    Integer hardDiskCapacity; // Объем жесткого диска
    String operatingSystem; // Операционная система
    String color; // Цвет
    Double diagonal;
    Integer numberProcessorCores;

    void  PrintInfo(){
        System.out.printf("%s: ОЗУ %dГб, RAM %dГб, %s, %s, Диагональ экрана %.1f, Количество ядер процессора %d", nameNotebook, RAM, hardDiskCapacity, operatingSystem, color, diagonal, numberProcessorCores);
    }

    Notebook(String name, Integer ram, Integer hardDisk, String operSys, String col, Double diag, Integer numProcCor){
        nameNotebook = name;
        RAM = ram;
        hardDiskCapacity = hardDisk;
        operatingSystem = operSys;
        color = col;
        diagonal = diag;
        numberProcessorCores = numProcCor;
    }
}
