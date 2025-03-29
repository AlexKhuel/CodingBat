public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n -> 19-n >= 0 && n-13 >= 0);
  return nums;
}
