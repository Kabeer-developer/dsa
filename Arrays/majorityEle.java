public class majorityEle {
 public static void main(String[] args) {
    int count =0;
    int candidate=0;
    int[] arr = {1,1,1,1,1,1,2,3,5,5,5,2,1,1};

    for(int i=0;i<arr.length;i++){
      if(count==0){
         candidate=arr[i];
      }

      if(arr[i]==candidate){
         count++;
      } else {
         count--;
      }
    }

    // verify 
    count =0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==candidate){
         count++;
      }
    }
    if(count>arr.length/2){
      System.out.println(candidate);
    } else {
      System.out.println(-1);
    }
 }   
}
