import java.util.*;

public class Main {
    public static void main(String[] args) {
        // array
        int[] array = {3, 5, 2, 9, 7, 1};
        boolean found = false;

      
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 7) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
