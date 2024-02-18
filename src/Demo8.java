void main() {
    int x = 10;
    int y = x + 5;
    sum(x, y);
    System.out.println(STR."x=\{x}, y=\{y}");
}

void sum(int x, int y) {
    int result = (x = x + y);
    print(result);
    System.out.println(STR."x=\{x}, y=\{y}");
}

void print(int result) {
    String str = STR."Result=\{result}";
    System.out.println(str);
}