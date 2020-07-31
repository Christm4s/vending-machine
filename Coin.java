class Coin {

  final int denomination;
  int left;

  Coin(int a, int b) {

    denomination = a;
    left = b;
  }

  int dispenseCoin(int money) {

    left--;
    return money - denomination;
  }
}
