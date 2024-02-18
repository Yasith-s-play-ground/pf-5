void main() {
    System.out.println("Entering");
    int x = 10, y = 20;
    doSomething(x + y, x - y);
    System.out.println("Exiting");
}

void doSomething(int x, int y) {
    System.out.println(STR."x = \{x}, y = \{y}");
}