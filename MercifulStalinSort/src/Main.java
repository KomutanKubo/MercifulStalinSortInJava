import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,6,4,2,9,6,4,2,0);
        List<Double> list2 = List.of(1.0,6.0,4.0,2.0,67.0,764.0,75.0,46.0,2561.0,6.0,8.0,2325.0,578.0);
        System.out.println(MercifulStalinSort.mercifulStalinSort(list1));
        System.out.println(MercifulStalinSort.mercifulStalinSort(list2));

    }
}