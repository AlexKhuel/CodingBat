public boolean evenlySpaced(int a, int b, int c) {
  if(a-b == b-c || a-c == c-b || b-a == a-c) return true;
  return false;
}
