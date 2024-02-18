import java.util.Scanner;

void main() {
    int max = getMaxValue(new Scanner(System.in), 0);
    System.out.println(STR."Max value is \{max}");
}

int getMaxValue(Scanner scanner, int count) {
    System.out.print("Enter value : ");
    int value = scanner.nextInt();
    int maxValue;

    return ++count != 4 ? (maxValue = getMaxValue(scanner, count)) > value ? maxValue : value : value;

}