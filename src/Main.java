import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Set<Integer> integers1 = new TreeSet<>();
        integers1.add(0);
        integers1.add(1);
        integers1.add(2);
        System.out.println(symmetricDifference(integers, integers1));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set, Set<Integer> integers) {
        Set<Integer> set1 = new TreeSet<>();
        for (Integer integer : set) {
            for (Integer integer1 : integers) {
                if (!set.contains(integer1)) {
                    set1.add(integer1);
                } else if (!integers.contains(integer)) {
                    set1.add(integer);
                }
            }
        }
        return set1;
    }
}