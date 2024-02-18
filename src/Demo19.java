import java.util.List;

void main(){

}

void myFun(List myList, int myInt){
}
//m1 signature = myFun(List, int)
int myFun(List<String> names){
    return 0;
}
//m2 signature = myFun(List<String>)

//m1 != m2
//T.E m1 = myFun(List, int)
//T.E m2 = myFun(List)
//T.E m1 != T.E m2
//Not override equivalent