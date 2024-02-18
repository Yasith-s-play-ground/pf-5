void main() {
    byte a = 10;
    short b = 20, c = 30;
    myMethod(a, b, c);
}

void myMethod(short x, int y, long f) {
    System.out.println("A. myMethod(short,int,long)");
}

void myMethod(double x, float y, long z) {
    System.out.println("B. myMethod(double,float,long)");
}

void myMethod(long l, float f, double x) {
    System.out.println("D. myMethod(long,float,double)");
}

void myMethod(int x, Integer y, long l) {
    System.out.println("C. myMethod(int,Integer,long)");
}