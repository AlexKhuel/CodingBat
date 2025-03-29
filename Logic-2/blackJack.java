public int blackjack(int a, int b) {
  a = 21-a;
  b = 21-b;
  if(a < 0 && b < 0) return 0;
  if((a < b && a >= 0) || b < 0) return 21-a;
  return 21-b;
}
