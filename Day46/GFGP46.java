package Day46;

// GFG Serialize and deserialize a binary tree

//{ Driver Code Starts
  import java.io.*;
  import java.util.*;
  import java.util.LinkedList;
  import java.util.Queue;
  
  class Node {
      int data;
      Node left;
      Node right;
  
      Node(int data) {
          this.data = data;
          left = null;
          right = null;
      }
  }
  
  class GfG {
  
      static Node buildTree(String str) {
  
          if (str.length() == 0 || str.charAt(0) == 'N') {
              return null;
          }
  
          String ip[] = str.split(" ");
          // Create the root of the tree
          Node root = new Node(Integer.parseInt(ip[0]));
          // Push the root to the queue
  
          Queue<Node> queue = new LinkedList<>();
  
          queue.add(root);
          // Starting from the second element
  
          int i = 1;
          while (queue.size() > 0 && i < ip.length) {
  
              // Get and remove the front of the queue
              Node currNode = queue.peek();
              queue.remove();
  
              // Get the current node's value from the string
              String currVal = ip[i];
  
              // If the left child is not null
              if (!currVal.equals("N")) {
  
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
                  // Push it to the queue
                  queue.add(currNode.left);
              }
  
              // For the right child
              i++;
              if (i >= ip.length) break;
  
              currVal = ip[i];
  
              // If the right child is not null
              if (!currVal.equals("N")) {
  
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
  
                  // Push it to the queue
                  queue.add(currNode.right);
              }
              i++;
          }
  
          return root;
      }
  
      static void deletetree(Node root) {
          if (root == null) return;
          deletetree(root.left);
          deletetree(root.right);
          root.left = null;
          root.right = null;
      }
  
      static void printInorder(Node root) {
          if (root == null) return;
  
          printInorder(root.left);
          System.out.print(root.data + " ");
  
          printInorder(root.right);
      }
  
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
          int t = Integer.parseInt(br.readLine());
          while (t-- > 0) {
              String s = br.readLine();
              Node root = buildTree(s);
  
              Tree tr = new Tree();
              ArrayList<Integer> A = tr.serialize(root);
              deletetree(root);
              root = null;
  
              Node getRoot = tr.deSerialize(A);
              printInorder(getRoot);
              System.out.println();
          }
      }
  }
  // } Driver Code Ends
  
  
  /*Complete the given function
  Node is as follows:
  class Tree{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=right=null;
      }
  }*/
  
  
  
  /*Complete the given function
  Node is as follows:
  class Tree{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=right=null;
      }
  }*/
  
  class Tree {
      // Function to serialize a tree and return a list containing nodes of tree.
      public ArrayList<Integer> serialize(Node root) {
          ArrayList<Integer> arr = new ArrayList<>();
          Queue<Node> q = new LinkedList<>();
          q.add(root);
          while(!q.isEmpty()){
              int size = q.size();
              while(size -- > 0){
                  Node cur = q.poll();
                  arr.add(cur == null ? -1 : cur.data);
                  if(cur == null) continue;
                  q.add(cur.left); q.add(cur.right);
              }
          }
          return arr;
      }
  
      // Function to deserialize a list and construct the tree.
      public Node deSerialize(ArrayList<Integer> A) {
          Node root = null;
          Queue<Node> q = new LinkedList<>();
          q.add(null);
          int p = 0;
          while(!q.isEmpty() && p < A.size()){
              Node cur = q.poll();
              if(root == null) {root = new Node(A.get(p++)); q.add(root); if(root.data == -1) return null;}
              else{
                  Node left = new Node(A.get(p++));
                  Node right = new Node(A.get(p++));
                  if(left.data != -1) {cur.left = left; q.add(left);}
                  if(right.data != -1) {cur.right = right; q.add(right);}
              }
          }
          return root;
      }
  };
