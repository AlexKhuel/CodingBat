public String frontBack(String str) {
  if(str.length() > 1){
    String one = str.substring(0,1);
    String two = str.substring(str.length()-1, str.length());
    str = two + str.substring(1, str.length()-1) + one;
  }
  return str;
}
