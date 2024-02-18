void main() {
    System.out.println("Let's talk about methods then!");
    myFn(5);
    myFn(7);
    System.out.println("------------------");
    System.out.println(STR."x*x + 3x + 2 = \{myFn2(5)}");
    System.out.println(STR."x*x + 3x + 2 = \{myFn2(7)}");
}

void myFn(int x) {
    System.out.println(STR."x*x + 3x + 2 = \{x * x + 3 * x + 2}");
}

int myFn2(int x) {
    return x * x + 3 * x + 2;
}