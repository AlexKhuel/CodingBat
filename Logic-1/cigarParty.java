public boolean cigarParty(int cigars, boolean isWeekend) {
  if(40 <= cigars && cigars <= 60 || isWeekend && 40 <= cigars) return true;
  return false;
}
