package Day48;

import java.util.Arrays;

// Leetcode 881. Boats to Save People

class Solution {
  public int numRescueBoats(int[] people, int limit) {
      int boats = 0;
      Arrays.sort(people);
      int i=0,j=people.length-1;
      while(i<=j){
          if((people[j]+people[i])<=limit){
              i++;
          }
          j--;
          boats++;
      }
      return boats;
  }
}
