void main() {
    print(5, 0);
}

void print(int row, int column) {
    if (row == 0) return;
    System.out.print("* ");
    if (++column == row) {
        System.out.println();
        --row;
        column = 0;
    }
    print(row, column);
}