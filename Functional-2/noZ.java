public List<String> noZ(List<String> strings) {
  strings.removeIf(n -> n.indexOf("z") != -1);
  return strings;
}
