void main() {
    short a = 10;
    myMethod(a, a, a); //myMethod(short,short,short)
}

void myMethod(int x, short y, double z) {
    System.out.println("A. myMethod(int,short,double)"); //0
}

void myMethod(short x, int y, float z) {
    System.out.println("B. myMethod(short,int,float)"); //0
}

void myMethod(short x, short y, long z) {
    System.out.println("C. myMethod(short,short,long)");  //2 This is not specific to all other 3 methods, it is specific to only 2 others.
}

//void myMethod(short x, long z, short y){
//    System.out.println("D. myMethod(short,long,short)");  //0
//
//}
