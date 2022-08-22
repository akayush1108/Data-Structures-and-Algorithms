/*
Problem Statement:
You are given a partially written LinkedList class.
You are required to complete the body of mergeTwoSortedLists function. 
The function is static and is passed two lists which are sorted. 
The function is expected to return a new sorted list containing elements of both lists. 

Sample Input

5
10 20 30 40 50
10
7 9 12 15 37 43 44 48 52 56

Sample Output

7 9 10 12 15 20 30 37 40 43 44 48 50 52 56 

 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergeTwoSortedLL {

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
	    
	    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            // write your code here
	    	Node one=l1.head;
	    	Node two=l2.head;
	    	
	    	LinkedList res = new LinkedList();
	    	
	    	while(one != null && two != null) {
	    		if(one.data<two.data) {
	    			res.addLast(one.data);
	    			one = one.next;
	    		}
	    		else {
	    			res.addLast(two.data);
	    			two=two.next;
	    		}
	    	}
	    	
	    	while(one != null) {
	    		res.addLast(one.data);
	    		one=one.next;
	    	}
	    	while(two != null) {
	    		res.addLast(two.data);
	    		two=two.next;
	    	}
	    	
	    	return res;
        }
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int n2 = Integer.parseInt(br.readLine());
        LinkedList l2 = new LinkedList();
        String[] values2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            int d = Integer.parseInt(values2[i]);
            l2.addLast(d);
        }

        LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
        merged.display();
//        l1.display();
//        l2.display();
			    
	}
}