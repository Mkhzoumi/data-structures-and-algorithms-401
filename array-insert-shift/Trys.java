
import java.util.Arrays;

public class Trys {
    public static void main(String[] args) {

        int n=4;
        int[] arr={1,2,3,5,6};
        System.out.println(Arrays.toString(insertShiftArray(arr , n)));
    }



    public static int[] insertShiftArray(int[] arr , int num){
        int[] newArr = new int[(arr.length+1)];
        for (int i = 0; i <= arr.length; i++) {
            if (i < Math.ceil((double)arr.length/2)){
                newArr[i]= arr[i];
            }else if(i == Math.ceil((double)arr.length/2)){
                newArr[i] = num;
            }else{
                newArr[i] = arr[i-1];
            }
        }

        return newArr;
    }

}
