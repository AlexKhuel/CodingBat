public String everyNth(String str, int n) {
  String newStr = str.substring(0,1);
  for(int i = n; i < str.length(); i += n){
    newStr += str.substring(i, i+1);
  }
  return newStr;
}
