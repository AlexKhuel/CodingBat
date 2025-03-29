public String withoutString(String base, String remove) {
  boolean found = false;
  while(!found){
    //I have to do toLowerCase because indexOf and contains are case sensitive
    if(base.toLowerCase().contains(remove.toLowerCase())) base = base.substring(0, base.toLowerCase().indexOf(remove.toLowerCase())) + base.substring(base.toLowerCase().indexOf(remove.toLowerCase())+remove.length());
    else found = true;
  }
  return base;
}
