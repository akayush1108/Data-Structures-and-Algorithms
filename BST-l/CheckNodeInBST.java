/*
 Check Node is present in BST or not. If present return true else false.
 */

import java.io.*;
import java.util.*;

public class CheckNodeInBST {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(int[] arr,int lo,int hi) {
	  if(lo>hi) {
		  return null;
	  }
	  
	  int mid = (lo+hi)/2;
	  
	  int data = arr[mid];
	  Node lc = construct(arr, lo,mid-1);
	  Node rc = construct(arr,mid+1,hi);
	  
	  Node node=new Node(data,lc,rc);
	  return node;
    
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }


  public static boolean find(Node node, int data){
    // write your code here
    if(node==null){
        return false;
    }
    
    if(data>node.data){
        return find(node.right,data);
    }
    else if(data<node.data){
        return find(node.left,data);
    }
    else{
        return true;
    }
  }  

  public static void main(String[] args) throws Exception {
	  Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	    	arr[i]=scn.nextInt();
	    }
	    Node root = construct(arr,0,arr.length-1);
	
	    int data = scn.nextInt();
	    boolean found = find(root, data);
	
	    System.out.println(found);
  }

}