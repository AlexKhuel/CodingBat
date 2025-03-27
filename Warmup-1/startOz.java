public String startOz(String str) {
  if(str.length() > 1){  
    if(str.substring(0,1).equals("o") && str.substring(1,2).equals("z")) return str.substring(0,2);
    if(str.substring(1,2).equals("z")) return "z";
  }
  if(str.length() > 0){
    if(str.substring(0,1).equals("o")) return "o";
  }
  return "";
}
