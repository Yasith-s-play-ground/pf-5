import java.io.Serializable;

class Demo25{
    class Super{
         <T extends Serializable>void myMethod(T t, Object o){}
        //m1 signature = myMethod(T,Object)
        //T.E m1 = myMethod(Serializable, Object)
        void myMethod(Object myObject, Serializable s){}
        //m2 signature = myMethod(Object, Serializable)
        //T.E m2 = myMethod(Object, Serializable)
    }

    class Sub extends Super{
        @Override
       <K extends Serializable> void myMethod(K myK, Object o){}
        //m3 signature = myMethod(K,Object)
        //T.E m3 = myMethod( Serializable,Object)

        static <T extends Serializable> void myMethod(Object o, T t,int x){}
        //m4 signature = myMethod(Object,T)
        //T.E m4 = myMethod(Object,Serializable)

        //T.E m2 = T.E m4  // m2 =m4 signature not override because m4 is static this is error
        //T.E m1 = T.E m3 // override, non static, no error

        //after adding int x parameter to m4, m3 and m4 overload, m2 and m4 overload

        //override between 2 classes
        
        // overload in same class or between 2 classes
    }
}