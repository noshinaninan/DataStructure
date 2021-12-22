package com.datastructures.DataStructure.binarysearchtree;

public class BinarySearchTree {
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data, Node left, Node right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	public void insert(Node troot,int data) {
		Node temp=null;
		while(troot!=null) {
			temp=troot;
			if(data==troot.data)
				return;
			else if(data<troot.data)
				troot=troot.left;
			else if(data>troot.data)
				troot=troot.right;
		}
		Node n=new Node(data,null,null);
		if(root!=null) {
			if(data<temp.data)
				temp.left=n;
			else
				temp.right=n;
		}
		else
			root=n;
	}
	public Node recursiveInsert(Node troot,int data) {
		if(troot!=null) {
			if(data<troot.data)
				troot.left=recursiveInsert(troot.left,data);
			else if(data>troot.data)
				troot.right=recursiveInsert(troot.right, data);
		}
		else {
			Node n=new Node(data,null,null);
			troot=n;
		}
		return troot;
	}
	public void inorder(Node troot) {
		if(troot!=null) {
			inorder(troot.left);
			System.out.print(troot.data+" ");
			inorder(troot.right);
		}
	}
	public void preorder(Node troot) {
		if(troot!=null) {
			System.out.print(troot.data+" ");
			preorder(troot.left);
			preorder(troot.right);
		}
	}
	public void postorder(Node troot) {
		if(troot!=null) {
			postorder(troot.left);
			postorder(troot.right);
			System.out.print(troot.data+" ");
		}
	}
	public void levelOrder() {
		QueueLinkedForLevelOrder q = new QueueLinkedForLevelOrder();
		Node t=root;
		System.out.print(t.data+" ");
		q.enqueue(t);
		while(!q.isEmpty()) {
			t=(Node) q.dequeue();
			if(t.left!=null) {
				System.out.print(t.left.data+" ");
				q.enqueue(t.left);
			}
			if(t.right!=null) {
				System.out.print(t.right.data+" ");
				q.enqueue(t.right);
			}
		}
	}
	public boolean search(int key) {
		Node troot =root;
		while(troot!=null) {
			if(key==troot.data)
				return true;
			else if(key<troot.data)
				troot=troot.left;
			else if(key>troot.data)
				troot=troot.right;
		}
		return false;
	}
	public boolean recursiveSearch(Node troot,int key) {
		if(troot!=null) {
			if(key==troot.data)
				return true;
			else if(key<troot.data)
				return recursiveSearch(troot.left,key);
			else if(key>troot.data)
				return recursiveSearch(troot.right, key);
		}
		return false;
	}
	public boolean delete(int data) {
		Node p=root;
		Node pp=null;
		while(p!=null && p.data!=data) {
			pp=p;
			if(data<p.data)
				p=p.left;
			else
				p=p.right;
		}
		if(p==null)
			return false;
		if(p.left!=null && p.right!=null) {
			Node s=p.left;
			Node ps=p;
			while(s.right!=null) {
				ps=s;
				s=s.right;
			}
			p.data=s.data;
			p=s;
			pp=ps;
		}
		Node c=null;
		if(p.left!=null)
			c=p.left;
		else
			c=p.right;
		if(p==root)
			root=null;
		else {
			if(p==pp.left)
				pp.left=c;
			else
				pp.right=c;
		}
		return true;
		
	}
	public int count(Node troot) {
		if(troot!=null) {
			int x=count(troot.left);
			int y=count(troot.right);
			return x+y+1;
		}
		return 0;
	}
	public int height(Node troot) {
		if(troot!=null) {
			int x=count(troot.left);
			int y=count(troot.right);
			if(x>y)
				return x+1;
			else
				return y+1;
		}
		return 0;
	}

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.root=bst.recursiveInsert(bst.root, 50);
		bst.recursiveInsert(bst.root, 30);
		bst.recursiveInsert(bst.root, 80);
		bst.recursiveInsert(bst.root, 10);
		bst.recursiveInsert(bst.root, 40);
		bst.recursiveInsert(bst.root, 60);
		bst.recursiveInsert(bst.root, 90);
		bst.inorder(bst.root);
		System.out.println();
		bst.preorder(bst.root);
		System.out.println();
		bst.postorder(bst.root);
		System.out.println();
		bst.levelOrder();
		System.out.println();
		System.out.println(bst.search(10));
		System.out.println(bst.search(70));
		System.out.println();
		System.out.println(bst.recursiveSearch(bst.root, 40));
		System.out.println(bst.recursiveSearch(bst.root, 70));
		System.out.println(bst.delete(80));
		bst.levelOrder();
		System.out.println();
		System.out.println("no.of Nodes :"+bst.count(bst.root));
		System.out.println();
		System.out.println("height of tree :"+(bst.height(bst.root)-1));

	}

}
