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
        int bottles = in.nextInt();
        int OGbottle_amt = bottles;
        System.out.println();
        while (bottles > 2) {
            System.out.print(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer. Take one down, pass it around; ");
            bottles -= 1;
            System.out.print(bottles + " bottles of beer on the wall.\n");
            System.out.println();
        }
        while (bottles == 2) {
            System.out.print(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer. Take one down, pass it around; ");
            bottles -= 1;
            System.out.print(bottles + " bottle of beer on the wall.\n");
            System.out.println();
        }
        while (1 < bottles) {
            System.out.print(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer. Take one down, pass it around; ");
            bottles -= 1;
            System.out.print(bottles + " bottle of beer on the wall.\n");
            System.out.println();
        }
        while (0 < bottles) {
            System.out.print(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer. Take one down, pass it around; ");
            bottles -= 1;
            System.out.print("no more bottles of beer on the wall.\n");
            System.out.println();
            System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more; " + OGbottle_amt + " more bottles of beer on the wall");
        }
    System.out.println();
    }}