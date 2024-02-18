import java.io.Serializable;

class Demo24<T extends Serializable, K>{

    //void myMethod(Object o, K k){}
    //m1 signature = myMethod(Object,K)
    //T.E m1= myMethod(Object, Object)
    //T.E m1 = T.E m2
    void myMethod(K k, Object o){}
    //m2 signature = myMethod(K,Object)
    //T.E m2= myMethod(Object, Object)

    //int myMethod(T myT, K k){return 0;}
    //m3 signature = myMethod(T,K)
    //T.E m3 = myMethod(Serializable,Object)
    <S extends T> void myMethod(S myS, Object o){}
    //m4 signature = myMethod(S,Object)
    //T.E m4 = MyMethod(Serializable,Object)
    //T.E m3 = T.E m4


}