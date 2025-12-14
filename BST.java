package fever;


class Tree{
	char data;
	Tree left;
	Tree right;
	
	public Tree() {
		
	}
	public Tree(char c) {
		data=c;
	}
}
public class Bst{
	
	public static void preorder(Tree t) {
		if(t==null) {
			return ;
		}
		System.out.print(t.data+" ");
		preorder(t.left);
		preorder(t.right);
	}
	
	public static void inorder(Tree t) {
		if(t==null) {
			return ;
		}
		inorder(t.left);
		System.out.print(t.data+" ");
		inorder(t.right);
	}
	
	public static void postorder(Tree t) {
		if(t==null) {
			return ;
		}
		postorder(t.left);
		postorder(t.right);
		System.out.print(t.data+" ");
	}
	
	public static Tree insert(Tree cur, Tree node) {

			if(cur==null) { // if an empty tree (especially to add root node)
				cur=node;
				return cur;
			}
			
			if(node.data < cur.data) { // if node value is less than root
				if(cur.left !=null)
				insert(cur.left,node); // traverse through left
				else {
					cur.left=node;  // got the empty place assign it.
					return node;
				}
			}
			else { // if node value is greater than root AND let's ignore equal to case (assuming only unique values in tree)
				if(cur.right!=null)
				insert(cur.right,node); // traverse through right
				else {
					cur.right=node;  // got the empty place assign it.
				    return node;	
				}
			}
			
			return node;
		}
		

	public static void main(String args[]) {
//		Tree root= new Tree();
//		root.data='F';
//		Tree t1= new Tree('B');
//		root.left= t1;
//		Tree t2= new Tree('G');
//		root.right= t2;
//		t1.left= new Tree('A');
//		t1.right= new Tree('D');
//		t1.right.left= new Tree('C');
//		t1.right.right=new Tree('E');
//		t2.right= new Tree('I');
//		t2.right.left= new Tree('H');
		
		
		
//		root.data='F';
		Tree root = insert(null,new Tree('F'));
		
		insert(root,new Tree('B'));
		insert(root,new Tree('G'));
		insert(root,new Tree('A'));
		insert(root,new Tree('D'));
		insert(root,new Tree('I'));
		insert(root,new Tree('C'));
		insert(root,new Tree('E'));
		insert(root,new Tree('H'));
		
//		System.out.println('A' <'B');
		System.out.print("Preorder Traversal:  ");
		preorder(root);
		System.out.println();
		System.out.print("Inorder Traversal:  ");
		inorder(root);
		System.out.println();
		System.out.print("Postorder Traversal:  ");
		postorder(root);
		
		
	}
}

