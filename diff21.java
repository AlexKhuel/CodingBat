public int diff21(int n) {
  int a = 21-n;
  if(a < 0) a = -a;
  if(n > 21) return 2*a;
  return a;
}
