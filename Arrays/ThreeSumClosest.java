public class ThreeSumClosest {
    class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int result = arr[0] + arr[1] + arr[2];
        int diff = Math.abs(target - result);

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    int tempDiff = Math.abs(target - temp);

                    if (tempDiff < diff) {
                        diff = tempDiff;
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
}
