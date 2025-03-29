public int makeChocolate(int small, int big, int goal) {
  if( (big *  5) + small < goal ) return -1;
  if( !((goal % 5) == 0 || (goal % 5) <= small)) return -1;
  return Math.max( goal % 5, goal - big*5);
}
