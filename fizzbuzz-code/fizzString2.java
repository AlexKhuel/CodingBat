public String fizzString2(int n) {
  if(n%5 == 0 && n%3 == 0) return "FizzBuzz!";
  if(n%3 == 0) return "Fizz!";
  if(n%5 == 0) return "Buzz!";
  return n + "!";
}
