#include<iostream>
using namespace std;
class Demo{
    public:
    int a;
    string str;
};

int main(){
    // new keyword is reserved for DMA in c++
    Demo obj; // Syntax 1
    obj.a;
    Demo obj1 = Demo(); // Syntax 2
    obj1.str;
    return 0;
}
