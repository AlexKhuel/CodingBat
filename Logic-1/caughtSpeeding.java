public int caughtSpeeding(int speed, boolean isBirthday) {
  if(61 <= speed && speed <= 80 && !isBirthday) return 1;
  if(66 <= speed && speed <= 85 && isBirthday) return 1;
  if(speed < 61 || speed < 66 && isBirthday) return 0;
  return 2;
}
