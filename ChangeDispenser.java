class ChangeDispenser {

  public static void main(String[] args) {

    int money = Integer.parseInt(args[4]);
    int ones = 0;
    int twos = 0;
    int fives = 0;
    int tens = 0;
    Coin one = new Coin(1, Integer.parseInt(args[0]));
    Coin two = new Coin(2, Integer.parseInt(args[1]));
    Coin five = new Coin(5, Integer.parseInt(args[2]));
    Coin ten = new Coin(10, Integer.parseInt(args[3]));
    while(money > 0) {
      if(money >= 10 && ten.left > 0) {
        tens++;
        money = ten.dispenseCoin(money);
      }
      else if(money >= 5 && five.left > 0) {
        fives++;
        money = five.dispenseCoin(money);
      }
      else if(money >= 2 && two.left > 0) {
        twos++;
        money = two.dispenseCoin(money);
      }
      else if(one.left > 0){
        ones++;
        money = one.dispenseCoin(money);
      }
      else{
        System.out.println("Not enough change. Try again later!!");
        System.exit(0);
      }
    }
    System.out.println("Ones -----> "+ ones);
    System.out.println("Twos -----> "+ twos);
    System.out.println("Fives -----> "+ fives);
    System.out.println("Tens -----> "+ tens);
  }
}
