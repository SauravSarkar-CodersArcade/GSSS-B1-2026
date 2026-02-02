#include<stdio.h>
int hammingWeight(int n){
        int count = 0;
        while (n != 0){
            if(n & 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
int * function(){
    static int x = 20; // 0x2000 [20] // Globally Accessible
    return &x; // 0x2000
}
int main(){
    int * ptr = function(); // 0x2000
    printf("The value is: %d\n", *ptr);
    (2>3) ? printf("True") : printf("False");
    printf("\n%d\n", hammingWeight(15));
}