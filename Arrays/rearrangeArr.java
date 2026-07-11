import java.util.ArrayList;

public class rearrangeArr {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-4,5,6,-8};
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negList.add(arr[i]);
            } else {
                posList.add(arr[i]);
            }
        }
        int j=0;

        while(j<negList.size() && j<posList.size()){
            System.out.print(posList.get(j)+" ");
                        System.out.print(negList.get(j)+" ");
                        j++;
        }
       while(j<posList.size()){
                    System.out.print(posList.get(j));
                    j++;
       }
        while(j<negList.size()){
                    System.out.print(negList.get(j));
                    j++;
       }
        
    }
}
