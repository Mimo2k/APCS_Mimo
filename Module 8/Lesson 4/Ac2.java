import java.util.*;

class Ac2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers: " + Arrays.toString(findEvenNumbers(numbers)));
    }

    public static int[] findEvenNumbers(int[] numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) evens.add(num);
        }
        
        int[] res = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) res[i] = evens.get(i);
        return res;
    }
}