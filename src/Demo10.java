void main() {
    System.out.println("About to enter into doSomething() method");
    int i = doSomething(); // method invocation expression statement
    System.out.println(i);
    System.out.println("Just exited from doSomething() method");
}

int doSomething() {
    System.out.println("Hello");
    System.out.println("IJSE");
    System.out.println("DEP");
    return 10 + 15;
}