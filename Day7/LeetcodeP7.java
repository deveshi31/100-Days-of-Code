package Day7;

// Leetcode 287. Find the Duplicate Number

class Solution {
  public int findDuplicate(int[] nums) {
      int slow = nums[0];
      int fast = nums[0];
      do { // we are sure that at least one duplicate is there
          slow = nums[slow];
          fast = nums[nums[fast]];
      } while(slow != fast);
      // find the head of loop
      fast = nums[0];
      while(slow != fast) {
          slow = nums[slow];
          fast = nums[fast];
      }
      return fast;
  }

  @Override
  public String toString() {
    return "Solution []";
  }
}