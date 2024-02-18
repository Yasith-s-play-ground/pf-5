void main() {
    byte a = 10;
    short b = 20;
    int c = 30;
    myMethod(a, b, c);  //myMethod(byte,short,int)
}

void myMethod(int x, long y, double z) {
    System.out.println("A. myMethod(int, long, double)");
}

void myMethod(long x, float f, long d) {
    System.out.println("B. myMethod(long, float, long)");
}

void myMethod(short s, int i, long f) {
    System.out.println("C. myMethod(short, int, long)");

}