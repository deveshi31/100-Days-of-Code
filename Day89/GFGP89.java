package Day89;

// GFG Armstrong Numbers

class Solution {
  static String armstrongNumber(int n) {
      // code herewhile
      int n1=n;// storing oringinal number for comparision;
      int num=0;
      int sum=0;
      while(n>0){
          num=n%10;
          sum+=(int)Math.pow(num,3);// getting the cube of each number and add it to sum;
          n=n/10;
      }if(sum==n1){
          return "true";
      }return "false";
  }
}
