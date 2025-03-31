public boolean squirrelPlay(int temp, boolean isSummer) {
  if(60 <= temp && temp <= 90 || 60 <= temp && temp <= 100 && isSummer)return true;
  return false;
}
