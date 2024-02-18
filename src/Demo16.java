import java.util.Scanner;

void main() {
    int max = getMaxValue(new Scanner(System.in), 0, 0);
    System.out.println(STR."Max value is \{max}");
}

int getMaxValue(Scanner scanner, int max, int count) {
    System.out.print("Enter value : ");
    int value = scanner.nextInt();

    max = count == 0 || value > max ? value : max;
//    if (count == 0) max = value;
//    else if (value > max) max = value;

    count++;

    if (count != 4) max = getMaxValue(scanner, max, count);

    return max;

}