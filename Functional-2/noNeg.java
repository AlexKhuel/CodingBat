public List<Integer> noNeg(List<Integer> nums) {
  return nums.removeIf(n -> n<0) ? nums:nums;
}
