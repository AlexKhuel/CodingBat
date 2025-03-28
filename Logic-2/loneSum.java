public int loneSum(int a, int b, int c) {
  if(a != b && b != c && a != c) return a+b+c;
  if(a == b && b == c) return 0;
  if(a == b) return c;
  if(b == c) return a;
  return b;
}
