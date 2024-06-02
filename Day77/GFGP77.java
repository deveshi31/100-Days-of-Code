package Day77;

import java.util.ArrayList;
import java.util.Collections;

// GFG Construct list using given q XOR queries

class Solution {
  public static ArrayList<Integer> constructList(int q, int[][] queries) {
      // code here
      ArrayList<Integer> list = new ArrayList<>();
      list.add(0);
      int Xor=0;

      for (int[] query : queries) {
          if (query[0]==0) {
              list.add(query[1] ^ Xor);
          } else if (query[0]==1) {
              Xor^=query[1];
          }
      }

      for (int i=0; i<list.size(); i++) {
          list.set(i, list.get(i) ^ Xor);
      }

      Collections.sort(list);
      return list;
  }
}
