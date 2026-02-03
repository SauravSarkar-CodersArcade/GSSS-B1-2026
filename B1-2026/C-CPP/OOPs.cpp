#include<iostream>
using namespace std;
class Demo{
    public:
    string name;
    int age;
    Demo(string n, int a){
        name = n;
        age = a;
    }
    virtual void details(){
        cout << name << " " << age << endl;
    }
    ~Demo(){
        cout << "Destroyed!" << endl;
    }
};
class Child : Demo {
    public:
    Child(string n, int a) : 
    Demo(n, a){
    }
    void details() override {
        cout << name << " " << age << endl;
    }
};
int main(){
    Demo obj("A", 12);
    
    return 0;   
}