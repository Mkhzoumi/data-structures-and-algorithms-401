
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());


        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = 3;

        System.out.println(binarySearch(arr , num));
    }



    public static int binarySearch(int[] arr , int num) {

        int start = 0;
        int middle;
        int end = arr.length;

        while (start < end) {
            middle = (start + end) / 2;
            if (num == arr[middle]) {
                return middle;
            } else if (num < arr[middle]) {
                end = middle-1;
            } else {
                start = middle+1;
            }
        }
        return -1;
    }
}
