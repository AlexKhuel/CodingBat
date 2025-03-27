public boolean stringE(String str) {
  int eCount = 0;
  for(int i = 0; i < str.length(); i++){
    if(str.indexOf("e") != -1) eCount++;
    if(str.length() >= 2) str = str.substring(1, str.length());
    else break;
  }
  if(1 <= eCount && eCount <= 3) return true;
  return false;
}
