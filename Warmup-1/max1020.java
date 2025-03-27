public int max1020(int a, int b) {
  if(Math.abs(a-15) < 6 && Math.abs(b-15) < 6 ) return Math.max(a,b);
  if(Math.abs(a-15) < 6) return a;
  if(Math.abs(b-15) < 6) return b;
  return 0;
}
