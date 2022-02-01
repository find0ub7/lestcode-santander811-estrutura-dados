import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VogaisPrimeiroComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");
        if (vogais.contains(o1)) {
            if (vogais.contains(o2)) {
                return o1.compareTo(o2);
            } else {
                return -1;
            }
        } else {
            if (vogais.contains(o2)) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        }
    }
}
