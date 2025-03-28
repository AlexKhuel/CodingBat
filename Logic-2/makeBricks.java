public boolean makeBricks(int small, int big, int goal) {
  if( (big *  5) + small < goal ) return false;
  if( (goal % 5) == 0 || (goal % 5) <= small) return true;
  return false;
}
