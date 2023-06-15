package JavaProSummaryHomework1;

public class IndexOfElement {
    public IndexOfElement(String[] arr, String targ) {

        String[] array = arr;

        String target = targ;
       // ta"";
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                index = i;
                break;
            }
        }

        System.out.println("Индекс первого вхождения заданного элемента :'" + target + "':имеет значение в строковом массиве :" + index);
        System.out.println();
    }

}