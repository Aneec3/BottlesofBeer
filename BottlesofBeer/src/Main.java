import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Bottles Of Beer\n");
        Scanner in = new Scanner(System.in);
        System.out.print("How many bottles of beer are we starting with?   ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        int b = (int) in.nextDouble(); {
        int g = b;
        System.out.println();
        while (b > 2) {
            System.out.print(b + " bottles of beer on the wall, " + b + " bottles of beer. Take one down, pass it around; ");
            b -= 1;
            System.out.print(b + " bottles of beer on the wall.\n");
            System.out.println();
        }
        while (b == 2) {
            System.out.print(b + " bottles of beer on the wall, " + b + " bottles of beer. Take one down, pass it around; ");
            b -= 1;
            System.out.print(b + " bottle of beer on the wall.\n");
            System.out.println();
        }
        while (1 < b) {
            System.out.print(b + " bottle of beer on the wall, " + b + " bottle of beer. Take one down, pass it around; ");
            b -= 1;
            System.out.print(b + " bottle of beer on the wall.\n");
            System.out.println();
        }
        while (0 < b) {
            System.out.print(b + " bottle of beer on the wall, " + b + " bottle of beer. Take one down, pass it around; ");
            b -= 1;
            System.out.print("no more bottles of beer on the wall.\n");
            System.out.println();
            System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more; " + g + " more bottles of beer on the wall");
        }
    System.out.println();
    }}}