/**
@ Shubham Sharma

 ==> Basic Shared Pointer Implementation
*/
#include<iostream>
using namespace std;

template<class T>
class SharedPtr{
    T* sPtr;
    int* refCount;
public:
    SharedPtr(T* ptr){
        sPtr = ptr;
        refCount = new int();
        *refCount = 1;
    }
    
    SharedPtr(const SharedPtr& ptr){
        // inside copy constructor
        this->sPtr = ptr.sPtr;
        *(ptr.refCount) = *(ptr.refCount) + 1;
        this->refCount = ptr.refCount;
        
    }
    
    T& operator= (const SharedPtr& ptr){
        // inside assignment constructor
        this->sPtr = ptr.sPtr;
        *(ptr.refCount) = *(ptr.refCount) + 1;
        this->refCount = ptr.refCount;
        return *this;
    }
    
    ~SharedPtr(){
        //inside destructor
        *refCount = *refCount - 1;
        if(*refCount == 0){
            delete sPtr;
            delete refCount;
        }
    }
    
    T* operator->(){
        return sPtr;
    }
    T& operator*(){
        return *sPtr;
    }
};

int main(void){
    sharedPtr<int> p = new int;
        {
                sharedPtr<int> q = p;
        }
    return 0;
}
