import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MercifulStalinSort {

    public static <T extends Comparable<T>> List<T> mercifulStalinSort(List<T> array){
        if(array.size() <= 1){
            return array;
        }

        T firstElement = array.getFirst();
        if (!TypeCode.isValidType(firstElement.getClass())) {
            throw new IllegalArgumentException("Capitalist data type for Merciful Stalin Sort. Comrade types are: " + Arrays.toString(TypeCode.values()));
        }

        //Forward Pass
        List<T> forwardSorted = new ArrayList<>();
        List<T> forwardRemaining = new ArrayList<>();

        T max1 = array.getFirst();
        for(T candidate : array){
            if (forwardSorted.isEmpty() || candidate.compareTo(max1) >= 0) {
                forwardSorted.add(candidate);
                max1 = candidate;
            } else {
                forwardRemaining.add(candidate);
            }
        }
        if(forwardRemaining.isEmpty()){
            return array;
        }

        //Backward Pass

        List<T> backwardSorted = new ArrayList<>();
        List<T> backwardRemaining = new ArrayList<>();

        T max2 = forwardRemaining.getLast();
        for (T candidate : forwardRemaining.reversed()){
            if (forwardSorted.isEmpty() || candidate.compareTo(max2) >= 0){
                backwardSorted.add(candidate);
                max2 = candidate;
            } else{
                backwardRemaining.add(candidate);
            }
        }


        List<T> mergedSorted = MergeArrays.mergeArrays(forwardSorted,backwardSorted);

        if(backwardRemaining.isEmpty()) {
            return mergedSorted;
        }

        List<T> sortedRemaining = mercifulStalinSort(backwardRemaining);
        return MergeArrays.mergeArrays(mergedSorted,sortedRemaining);
    }

}


