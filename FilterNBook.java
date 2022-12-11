public class FilterNBook {

    public String Filter(Notebook[] arr, Integer numCriteria) {
        String result = "Имя\t|Критерий\n";
        for (Notebook el : arr) {
            result += el.nameNotebook + "\t|" + GetCriteria(el, numCriteria) + "\n";
        }
        return result;
    }

    public String GetCriteria(Notebook arr, Integer numCriteria) {

        switch (numCriteria) {
            case 1:
                return arr.RAM.toString();
            case 2:
                return arr.hardDiskCapacity.toString();
            case 3:
                return arr.operatingSystem;
            case 4:
                return arr.color;
            case 5:
                return arr.diagonal.toString();
            case 6:
                return arr.numberProcessorCores.toString();

            default:
                return "Критерий отсуствует в фильтре";
        }
    }
}
