import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainArray {

        public static int[] findDuplicates(int[] array) {
            Map<Integer, Integer> counts = new HashMap<>();
            List<Integer> duplicates = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                counts.put(num, counts.getOrDefault(num, 0) + 1);

                if (counts.get(num) == 2) {
                    duplicates.add(num);
                }
            }

            int[] result = new int[duplicates.size()];
            for (int i = 0; i < duplicates.size(); i++) {
                result[i] = duplicates.get(i);
            }

            return result;
        }

        public static void main(String[] args) {
            int[] array = {1, 3, 2, 2, 3, 0};
            int[] duplicates = findDuplicates(array);
            System.out.println(Arrays.toString(duplicates)); // [2, 3]
        }
}

