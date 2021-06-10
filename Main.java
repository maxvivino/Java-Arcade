import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean play = true;
    boolean money = true;
    boolean alive = true;

    RouletteManager gerald = new RouletteManager();
    while(play && money){
      gerald.manager();
      money = gerald.getCanPlay();
      if(money == true) {
        play = gerald.getNextPlay();
      }
    }
//    memoryManager gerald = new memoryManager();
//    while(alive = true) {
//      gerald.memManager();
//      alive = gerald.
//    }
    }
  }
