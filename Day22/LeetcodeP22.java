package Day22;

// Leetocde 1700. Number of Students Unable to Eat Lunch

class Solution {
  public int countStudents(int[] students, int[] sandwiches) {
      int[] counts = new int[2];
      for (int student : students) counts[student]++;
      
      int remaining = sandwiches.length;
      for (int sandwich : sandwiches) {
          if (counts[sandwich] == 0) break;
          if (remaining-- == 0) break;
          counts[sandwich]--;
      }
      
      return remaining;
  }
}
