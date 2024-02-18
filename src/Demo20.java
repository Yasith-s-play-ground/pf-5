void main(){

}

public <T> void myMethod(T t){}
//m1 signature = myMethod(T)
public void myMethod(String s){}
//m2 signature = myMethod(String)

//m1 != m2
//T.E m1 = myMethod(Object)     because T is created in Diamond syntax
//T.E m2 = myMethod(String)
//T.E m1 != T.E m2

//Therefore not override equivalent
