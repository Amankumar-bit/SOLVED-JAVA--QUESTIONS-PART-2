package work6;


import java.util.Scanner;



public class main4 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		main4 m = new main4();
		BinaryTree bt = m.new BinaryTree();

//      
        int d= scn.nextInt();
        bt.rtl(d);
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}
		public void rtl(int d) {
int a=0;
		     rtl(this.root,a+root.data,d,""+this.root.data+" ");
		    }

		private void rtl(Node node,int a, int d, String str) {
	
			if(node.left==null&&node.right==null)
			{
				if(a==d)
				{
				System.out.println(str);
				}
				return ;
			}
			
			
			
			rtl(node.left,a+node.left.data,d,str+node.left.data+" ");
			rtl(node.right,a+node.right.data,d,str+node.right.data+" ");
			
			
			
		}
		 
		 


	}
}
