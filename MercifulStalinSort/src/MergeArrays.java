import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
    public static <T extends Comparable<T>> List<T> mergeArrays(List<T> array1, List<T> array2) {

        List<T> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < array1.size() && j < array2.size()) {

            if (array1.get(i).compareTo(array2.get(j)) <= 0) {
                result.add(array1.get(i));
                i++;
            } else {
                result.add(array2.get(j));
                j++;
            }
        }

        while (i < array1.size()) {
            result.add(array1.get(i));
            i++;
        }
        while (j < array2.size()) {
            result.add(array2.get(j));
            j++;
        }

        return result;
    }
}
