
// GFG Convert array into Zig-Zag fashion

import java.util.ArrayList;

class GFGP84 {
  public static void zigZag(int n, int[] arr) {
      for (int i = 0; i < n - 1; i++) {
          // If i is even, arr[i] should be less than arr[i+1]
          if (i % 2 == 0) {
              if (arr[i] > arr[i + 1]) {
                  // Swap arr[i] and arr[i+1]
                  int temp = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = temp;
              }
          } else {
              // If i is odd, arr[i] should be greater than arr[i+1]
              if (arr[i] < arr[i + 1]) {
                  // Swap arr[i] and arr[i+1]
                  int temp = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = temp;
              }
          }
      }
  }

  public int[] Series(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Series'");
  }

  public ArrayList<Integer> maximumWeight(int n, int[][] edges, int q, int[] queries) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'maximumWeight'");
  }
}
