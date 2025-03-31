public String getSandwich(String str) {
  int index1 = 0;
  int index2 = 0;
  Boolean first = false;
  for(int i = 0; i < str.length()-4; i++){
    if(str.substring(i, i+5).equals("bread") && !first) { 
      index1 = i+5;
      i += 4;
      first = true;
    }
    else if(str.substring(i, i+5).equals("bread")){
      index2 = i;
      i += 4;
    } 
  }
  if(index1 > 0 && index2 > 0) return str.substring(index1, index2);
  return "";
}
