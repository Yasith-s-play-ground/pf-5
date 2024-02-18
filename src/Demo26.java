void main() {
    myMethod(10, 15, 20);
}

void myMethod(int x, long y, long l) {
    System.out.println("A.myMethod(int,short,long)");
}

void myMethod(long x, double y, float z) {
    System.out.println("B.myMethod(long,double,float)");
}

//void myMethod(double x, long y, int z){
//    System.out.println("C.myMethod(double,long,int");
//}