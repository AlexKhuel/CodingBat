public String fizzString(String str) {
  if((str.substring(0,1) + str.substring(str.length()-1, str.length())).equals("fb")) return "FizzBuzz";
  if(str.length() < 1) return str;
  if(str.substring(0,1).equals("f")) return "Fizz";
  if(str.substring(str.length()-1,str.length()).equals("b")) return "Buzz";
  return str;
}
