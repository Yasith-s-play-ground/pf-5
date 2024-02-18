void main() {
    int a = 10;
    short b = 20;
    myMethod(10);

}
//void myMethod(int x) {
//    System.out.println("A.myMethod(int)");
//}
//
//void myMethod(long x) {
//    System.out.println("A.1 myMethod(long)");
//}
//void myMethod(Integer x) {
//    System.out.println("B.myMethod(Integer)");
//}
//
//void myMethod(Number x) {
//    System.out.println("C.myMethod(Number)");
//}

void myMethod(int... x) {
    System.out.println("D.myMethod(int...)");

}

//void myMethod(Integer... x) {
//    System.out.println("E.myMethod(Integer...)");
//}

//void myMethod(Number... x) {
//    System.out.println("F.myMethod(Number...)");
//}