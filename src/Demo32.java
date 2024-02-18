void main() {
    // myMethod(new int[]{10});
    int[] something1 = null;
    Integer[] something2 = null;
    myMethod(something2);
    myMethod(something1);
}

void myMethod(int[] num) {
    System.out.println("myMethod(int[])");
}
void myMethod(long[] num) {
    System.out.println("myMethod(long[])");
}
void myMethod(Integer[] num) {
    System.out.println("myMethod(Integer[])");

}

void myMethod(Number[] num) {
    System.out.println("myMethod(Number[])");

}

void myMethod(Object[] num) {
    System.out.println("myMethod(Object[])");
}

void myMethod(Object num) {
    System.out.println("myMethod(Object)");
}