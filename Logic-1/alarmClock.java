public String alarmClock(int day, boolean vacation) {
  if(1 <= day && day <= 5 && !vacation) return "7:00";
  if(1 <= day && day <= 5 && vacation) return "10:00";
  if((0 == day || day <= 6) && !vacation) return "10:00";
  return "off";
}
