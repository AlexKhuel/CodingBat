public boolean xyzThere(String str) {
  return str.split("\\.xyz", -1).length != str.split("xyz", -1).length;
}
