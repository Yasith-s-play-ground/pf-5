void main() {
    doSomething(2);
}

void doSomething(int x) {
    if (x == 0) return;
    doSomething(--x);
    System.out.println(x);
}