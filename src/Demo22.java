import java.io.Serializable;

void main(){

}

//<T extends Serializable> void myMethod(T myT)throws Exception{}
//m1 signature = myMethod(T)
public static void myMethod(Serializable mySet){}
//m2 signature = myMethod(Serializable)

//m1 != m2
//T.E m1 = myMethod(Serializable)   // if T is bounded, it goes to the bounded type, not Object
//T.E m2 = myMethod(Serializable)
//T.E m1=T.E m2
//These are sub signatures Not overloading