import java.util.Scanner;

public class RouletteManager {
    static int money;
    static int guess;
    static int bet;
    static int actual;
    static String play;
    static Scanner scan = new Scanner(System.in);

    public RouletteManager() {
        money = 100;
        play = "y";
    }

    public static void manager() {
        System.out.println("\nWelcome to Russian Roulette, how much would you like to bet.");
        bet = scan.nextInt();
        while (bet > money || bet <= 0) {
            while (bet > money) {
                System.out.println("You need to bet money you have you dummy.");
                bet = scan.nextInt();
            }
            while (bet <= 0) {
                System.out.println("You need to bet money.");
                bet = scan.nextInt();
            }
        }
        System.out.println("You choose to bet " + bet + " , What is your guess (1 - 6)");
        guess = scan.nextInt();
        actual = (int) (Math.random() * 6 + 1);
        System.out.println("Here we go.....");
        if (guess == actual) {
            System.out.println("You won, your guess was " + guess + " and it was " + actual);
            money = money + bet;
            System.out.println("Your new total is " + money);

        } else {
            System.out.println("Bam! You're dead, your guess was " + guess + " and it was " + actual);
            money = money - bet;
            System.out.println("Your new total is " + money);
        }
    }

    public static boolean getNextPlay() {
        System.out.println("Would you like to play again (y/n)");
        play = scan.next();
        if(play.equals("n")){
            System.out.println("Thanks for playing!");
        }
        return (play.equals("y"));
    }

    public static boolean getCanPlay() {
        if(money <= 0){
            System.out.println("You lose you stinky loser!");
        }
        return (money > 0);
    }
}