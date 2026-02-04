package demo;
public class MissingElementInArray {
    public static int findMissingElement(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] != mid+1){
                // Left Side
                // While going left - do these checks
                // 1. If we reach index 0 -> 1 is the missing element
                // 2. If arr[mid-1] == mid, we found the gap - return next of mid
                if(mid == 0 || arr[mid-1] == mid){
                    return mid + 1;
                }
                e = mid - 1;
            }else {
                // (element = index + 1)(Matching) Move to the Right side
                s = mid + 1;
            }
        }
        return arr.length + 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7};
        System.out.println("Missing Element: " + findMissingElement(arr1));
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println("Missing Element: " + findMissingElement(arr2));
    }
}
