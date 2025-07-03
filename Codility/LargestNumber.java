import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
    int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {
        // Step 1: convert int array to String array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

         Arrays.sort(strNums, (a,b) -> (b+a).compareTo(a+b));

        // Step 3: edge case: if first is "0", all are "0"
        if (strNums[0].equals("0")) return "0";

        // Step 4: concatenate
        
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }
    
}
