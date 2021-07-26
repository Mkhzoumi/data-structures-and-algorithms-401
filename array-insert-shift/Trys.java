import java.util.Arrays;

public class Trys {
    public static void main(String[] args) {
        
        int n=3;
        int[] arr={1,2,4,5};
        System.out.println(Arrays.toString(insertShiftArray(arr , n)));
    }



    public static int[] insertShiftArray(int[] arr , int num){
        int[] newArr = new int[(arr.length+1)];
        for (int i = 0; i <= arr.length; i++) {
            if (i < arr.length/2){
                newArr[i]= arr[i];
            }else if(i == arr.length/2){
                newArr[i] = num;
            }else{
                newArr[i] = arr[i-1];
            }
        }

        return newArr;
    }

}
