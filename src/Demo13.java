void main() {
    printHello(0);
}

void printHello(int x) {
    System.out.println("Hello");
    if (x == 2) return;
    printHello(x + 1);
}