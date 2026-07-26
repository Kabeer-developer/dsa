
public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,9,11,13};
        int[] arr2 = {2,4,6,8,10};

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}