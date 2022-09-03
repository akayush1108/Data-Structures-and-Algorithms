/*
Problem Statement :
For a given Binary Tree of integers, find and return the height of the tree.
*/


import java.util.Scanner;

public class HeightOfTree {
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null)     // base case
			return -1;		 // -1 for edges, 0 for nodes
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int totalHeight = Math.max(leftHeight, rightHeight) + 1;   // 
		return totalHeight;
	}
	
	
	public static BinaryTreeNode<Integer> improvedInputBinaryTree(boolean isRoot, int parentData, boolean isLeftChild)
	{
		if(isRoot)
		{
			System.out.println("Enter root data :");
		}
		else
		{
			if(isLeftChild)
			{
				System.out.println("Enter left child of " + parentData);
			}
			else
			{
				System.out.println("Enter right child of " + parentData);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1)   //There is no binary tree.
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild = improvedInputBinaryTree(false, root.data, true);
		BinaryTreeNode<Integer> rightChild = improvedInputBinaryTree(false, root.data, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}


	public static void main(String args[])
	{
		BinaryTreeNode<Integer> root = improvedInputBinaryTree(true, 0, true);
		System.out.println(height(root));
		
	}
}

//Node of Binary Tree

class BinaryTreeNode<T>
{
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	public BinaryTreeNode(T data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}