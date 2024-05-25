package Day69;

// gfg

class Solution {
  long max_Books(int arr[], int n, int k) {
      // Your code here
       long max = 0;
      for(int i = 0; i < n;) {
          if(arr[i] > k) {
              i++;
              continue;
          }
          else {
              int j = i;
              long curr_max = 0;
              while( j < n && arr[j] <= k)
                  curr_max += arr[j++];
              i = j;
              max = Math.max(max, curr_max);
          }
      }
      return max;
  }
}
