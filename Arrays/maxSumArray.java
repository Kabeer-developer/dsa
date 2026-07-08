public class maxSumArray {
    public static void main(String[] args) {

        int[] arr = {1,2,-2,3,4,10,-1,5,6};

        int sum = 0;
        int max = 0;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;


        for(int i = 0; i < arr.length; i++){

            sum += arr[i];


            if(sum > max){ //sum<min

                max = sum;

                ansStart = start;
                ansEnd = i;
            }


            if(sum < 0){ // sum>0

                sum = 0;

                start = i + 1;
            }
        }


        System.out.println("Max Sum = " + max);

        System.out.print("Subarray = ");

        for(int i = ansStart; i <= ansEnd; i++){

            System.out.print(arr[i] + " ");
        }


    }
}
