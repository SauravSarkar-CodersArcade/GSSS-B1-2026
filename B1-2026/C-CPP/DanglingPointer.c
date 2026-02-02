#include<stdio.h>

int * function(){
    static int x = 20; // 0x2000 [20] // Globally Accessible
    return &x; // 0x2000
}
int main(){
    int * ptr = function(); // 0x2000
    printf("The value is: %d", *ptr);
}