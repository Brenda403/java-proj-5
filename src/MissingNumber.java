import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {

//    public static int findMissingNumber(int[] numbers, int maxNum) {
//        int sum = (maxNum * (maxNum + 1) / 2);
//        for (int num : numbers) {
//            sum -= num;
//        }
//        if (sum == 0) {
//            return 0;
//        } else {
//            return sum;
//        }
//    }

    public static int findMissingNumber(int[] numbers, int maxNum) {
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

        for (int i = 1; i<= maxNum; i ++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumber(numbers, maxNum);
        System.out.println("Missing number: " + missingNumber);
    }

}
