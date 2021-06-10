/*import java.util.Scanner;

class OldMainThatWorks {
  public static void main(String[] args) {
    int money = 100;
    //boolean play = true;
    int guess;
    int bet = 0;
    int actual;
    String play = "y";
    Scanner scan = new Scanner(System.in);

    System.out.println("\nWelcome to Russian Roulette, how much would you like to bet.");
    // count = scan.nextInt();
    while (bet <= money && play == "y") {
      bet = scan.nextInt();
      while (bet > money){
        System.out.println("You need to bet money you have you dummy.");
        bet = scan.nextInt();
      }
      while(bet <= 0){
        System.out.println("You need to bet money you fuck.");
        bet = scan.nextInt();
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
      System.out.println("Would you like to play again (y/n)");
      play = scan.next();
      

    }
  }
}

// System.out.println("\nWelcome to Russian Roulette, how much would you like to
// bet.");
// int count = scan.nextInt();
// if (count <= money){
// System.out.println("You choose to bet " + count);
// play = true;
// } else {
// System.out.println("That is above your current money, you have " + money + "
// Please run again");
// play = false;
// scan.close();
// System.exit(0);
// }*/