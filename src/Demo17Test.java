import java.util.Scanner;

void main() {
    //System.out.println();
    String minMaxPair = getMinMaxPair(new Scanner(System.in), 0, 0, 0);
    System.out.println(STR."(Min,Max)=\{minMaxPair}");
}

String getMinMaxPair(Scanner scanner, int count, int min, int max) {
    String minMaxPair;
    String pair;
    do {
        System.out.print("Enter a value pair (x,y) : ");
        pair = scanner.nextLine().trim();
        if (!pair.startsWith("(") || !pair.endsWith(")") || !pair.contains(",") || pair.indexOf(",") != pair.lastIndexOf(",")) {
            System.out.println("\033[31mInvalid pair, try again\033[0m");

        } else {
            break;
        }
    } while (true);

    count++;

    pair = pair.replace("(", "").replace(")", "");
    int firstNum = Integer.parseInt(pair.substring(0, pair.indexOf(",")));
    int secondNum = Integer.parseInt(pair.substring(pair.indexOf(",") + 1));

    if (count == 0) {
        min = firstNum;
        max = firstNum;
    }
    if (firstNum < min) min = firstNum;
    if (secondNum < min) min = secondNum;
    if (firstNum > max) max = firstNum;
    if (secondNum > max) max = secondNum;

    minMaxPair = STR."(\{min},\{max})";
    if (count != 4) minMaxPair = getMinMaxPair(scanner, count, min, max);
    return minMaxPair;
}


