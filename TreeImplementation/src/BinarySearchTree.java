
public class BinarySearchTree {
	Node node;
	public BinarySearchTree() {
		this.node=null;
	}
	public BinarySearchTree(int data) {
		this.node.data=data;
	}
	@SuppressWarnings("unused")
	private Node addNode(Node node,int data) {
		if(node==null)
			node=new Node(data);
		else if(data<node.data) {
			node.left=addNode(node.left,data);
		}
		else if(data>node.data) {
			node.right=addNode(node.right,data);
		}
		return node;
	}
	
	public void add(int data) {
		this.node=this.addNode(this.node,data);
	}
	
	public void insert(int data) {
		if(this.node==null)
			this.node=new Node(data);
		else {
			Node curnode=this.node;
			while(true) {
				if(data<curnode.data) {
					if(curnode.left==null) {
						curnode.left=new Node(data);
						this.node=curnode;
						break;
					}
					curnode=curnode.left;
				}
				else {
					if(curnode.right==null) {
						curnode.right=new Node(data);
						this.node=curnode;
						break;
					}
					curnode=curnode.right;
				}
			}
		}
	}
	public void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println("node"+node.data);
			inorder(node.right);
			
		}
	}
	public void preOrder(Node node) {
		if(node!=null) {
			System.out.println("node"+node.data);
			preOrder(node.left);
			preOrder(node.right);
			
		}
	}
	public void postOrder(Node node) {
		if(node!=null) {
			
			postOrder(node.left);
			postOrder(node.right);
			System.out.println("node"+node.data);
			
		}
	}
	
	
}
