public boolean closeFar(int a, int b, int c) {
  //This explanation isnt that great so you can ignore it if it doesnt help
  /*
  This one is a bit complicated. The first thing I check is if either a is one
  away from b or a is one away from c but not both. After that I have two different
  checks. I either check if c is two or more away from both a and b if a is one 
  away from b and if not, I check if b is two or more away from both a and c. I
  can "b is two away from a and c" check whenever the "a is one away from b" check
  is false because I already checked that one of the two is one away from a in the
  previous check.
  */
  if(Math.abs(a-b) <= 1 ^ Math.abs(a-c) <= 1 
  && (Math.abs(a-b) <= 1 ? 
  (Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2) : (Math.abs(a-b) >= 2 && Math.abs(c-b) >= 2) )) 
    return true;
  return false;
}
