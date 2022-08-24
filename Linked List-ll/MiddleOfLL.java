/*
Problem Statement: 
You are given a partially written LinkedList class.
You are required to complete the body of mid function. 
The function should be an iterative function and should return the mid of linked list. 
Also, make sure to not use size data member directly or indirectly (by calculating size via making a traversal). 
In linked list of odd size, mid is unambigous. In linked list of even size, consider end of first half as mid.

Sample Input 1:
addLast 10
addLast 20
addLast 30
addLast 40
addLast 50
mid

Sample Output 1:
30

Sample Input 2:
addLast 10
addLast 20
addLast 30
addLast 40

Sample Output 2:
20

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MiddleOfLL {

	public static class Node {
	    int data;
	    Node next;
	}
	
	public static class LinkedList {
	    Node head;
	    Node tail;
	    int size;
	   
	    void addLast(int val) {
	        Node temp = new Node();
	        temp.data = val;
	        temp.next = null;

	        if (size == 0) {
	        	head = tail = temp;
	        } 
	        else {
	        	tail.next = temp;
	        	tail = temp;
	        }

	        size++;
	    }
	    
	    public int size() {
	        return size;
	    }

	    public void display() {
	        for (Node temp = head; temp != null; temp = temp.next) {
	        	System.out.print(temp.data + " ");
	        }
	        System.out.println();
	    }
	    
	    public int mid(){
	        // write your code here
	    	Node s=head;
	    	Node f=head;
	    	
	    	while(f.next != 	null && f.next.next != null) {
	    		s=s.next;
	    		f=f.next.next;
	    	}
	    	return s.data;
	    }
	}
	
	public static void main(String[] args) throws Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  LinkedList list = new LinkedList();
			
		    String str = br.readLine();
		    while (str.equals("quit") == false) {
		    	if (str.startsWith("addLast")) {
			        int val = Integer.parseInt(str.split(" ")[1]);
			        list.addLast(val);
			      } 
			      else if (str.startsWith("size")) {
			        System.out.println(list.size());
			      } 
			      else if (str.startsWith("display")) {
			        list.display();
			      } 
			      else if(str.startsWith("mid")){
			          System.out.println(list.mid());
			      }
			      str = br.readLine();
			    
		    }
	}
}