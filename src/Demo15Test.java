void main() {
    print(5, 0);
}

void print(int row, int column) {
    if (row == 0) return;
    System.out.print(column == row ? "\n" : "* ");
    print(column == row ? row - 1 : row, column == row ? 0 : column + 1);
}