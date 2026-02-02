#include<stdio.h>
#include<stdbool.h>
enum Boolean {
    TRUE, FALSE
};
int main(){
    bool status = true;
    printf("%i\n", status);
    int x = 20;
    printf("%llu Bytes\n", sizeof(x));
    printf("%zu Bytes\n", sizeof(x));
    printf("%d\n", &x); // Not Recommended (-)ve
    printf("%p\n", &x); // Hexadecimal Address
    printf("%x\n", &x); // Base Address
    enum Boolean data = FALSE;
    printf("%d", data);
    return 0;
}