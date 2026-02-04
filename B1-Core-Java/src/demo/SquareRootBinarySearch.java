package demo;

public class SquareRootBinarySearch {
    static int sqrt(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }
            else if(square > n){
                // Too large value, move to the left for smaller values
                e = mid - 1;
            }else {
                // Store the probable answer & move to right side for the exact answer
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(37));
    }
}
