import java.util.Scanner;

void main() {
    String minMaxPair = getMinMaxPair(new Scanner(System.in), 0);
    System.out.println(STR."(Min,Max)=\{minMaxPair}");
}

String getMinMaxPair(Scanner scanner, int count) {
    String pair;
    int min, max;
    do {
        System.out.print("Enter a value pair (x,y) : ");
        pair = scanner.nextLine().trim();
        if (!pair.startsWith("(") || !pair.endsWith(")") || !pair.contains(",") || pair.indexOf(",") != pair.lastIndexOf(",")) {
            System.out.println("\033[31mInvalid pair, try again\033[0m");

        } else {
            break;
        }
    } while (true);

    pair = pair.replace("(", "").replace(")", "");
    int num1 = Integer.parseInt(pair.substring(0, pair.indexOf(",")));
    int num2 = Integer.parseInt(pair.substring(pair.indexOf(",") + 1));
    min = num1 < num2 ? num1 : num2;
    max = num1 > num2 ? num1 : num2;

    if (count != 3) {
        String previousPair = getMinMaxPair(scanner, ++count);

        previousPair = previousPair.replace("(", "").replace(")", "");
        int preMin = Integer.parseInt(previousPair.substring(0, previousPair.indexOf(",")));
        int preMax = Integer.parseInt(previousPair.substring(previousPair.indexOf(",") + 1));
        if (preMin < min) min = preMin;
        if (preMax > max) max = preMax;


    }
    return STR."(\{min},\{max})";


}


