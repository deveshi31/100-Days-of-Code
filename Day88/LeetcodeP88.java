package Day88;

import java.util.Arrays;

// Leetcode 2037. Minimum Number of Moves to Seat Everyone

class Solution {
  public int minMovesToSeat(int[] seats, int[] students) {
      Arrays.sort(seats);
      Arrays.sort(students);
      int n=seats.length;
      int sum=0;
      for(int i=0;i<n;i++){
          sum += Math.abs(seats[i]-students[i]);
      }
      return sum;
  }
}
