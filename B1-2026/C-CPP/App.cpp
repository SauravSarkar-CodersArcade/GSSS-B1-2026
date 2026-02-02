#include<iostream>
using namespace std;
// Ankita
namespace Ankita {
    void add(int a, int b){
    cout << a + b << endl;  
    }  
}
// Anusha 
namespace Anusha{
    void add(int a, int b){
        cout << a + b << endl;
    }
}
int main(){
    Ankita::add(1,2);
    Anusha::add(2,3);
    string str;
    getline(cin, str);
    cout << str;
    auto x = 20;
    return 0;
}