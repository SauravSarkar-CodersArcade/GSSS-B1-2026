public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {3,1,2,1,4,2,3};
        int res = 0;
        for (int i=0; i< arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println("The non-repeating element is: "
        + res);
    }
}
