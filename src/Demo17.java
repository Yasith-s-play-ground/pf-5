import java.util.Scanner;

void main() {
    System.out.println();
    String minMaxPair = getMinMaxPair(new Scanner(System.in), 0);
    System.out.println(minMaxPair);
}

String getMinMaxPair(Scanner scanner, int count) {
    count++;
    int commaIndex;
    int min = 0, max = 0, firstNum, secondNum;
    String pair = "";
    String minMaxPair;
    while (true) {
        System.out.print("Enter a value pair (x,y) : ");
        pair = scanner.next().trim();
        commaIndex = pair.indexOf(",");

        if (pair.isBlank() || commaIndex == -1) {
            System.out.println("Value pair is invalid! Please enter a valid pair");

        } else break;
    }
    firstNum = Integer.parseInt(pair.substring(0, commaIndex));
    secondNum = Integer.parseInt(pair.substring(commaIndex + 1));

    if (count == 0) {
        min = firstNum;
        max = firstNum;
    }
    if (firstNum < min) min = firstNum;
    if (secondNum < min) min = secondNum;
    if (firstNum > max) max = firstNum;
    if (secondNum > max) max = secondNum;

    minMaxPair = STR."\{min},\{max}";
    if (count != 4) minMaxPair = getMinMaxPair(scanner, count);
    return minMaxPair;
}