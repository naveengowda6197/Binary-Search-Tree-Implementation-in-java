
public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.add(1);
		binarySearchTree.add(2);
		binarySearchTree.add(10);
		binarySearchTree.add(0);
		//binarySearchTree.insert(11);
		BinarySearchTree binarySearchTree2=new BinarySearchTree();
		binarySearchTree2.insert(0);
		binarySearchTree2.insert(2);
		binarySearchTree2.insert(2);
		binarySearchTree2.insert(1);
		binarySearchTree2.insert(21);
		binarySearchTree.preOrder(binarySearchTree.node);
		System.out.println("--------------------------");
		
		binarySearchTree.inorder(binarySearchTree.node);
		System.out.println("--------------------------");
		
		binarySearchTree.inorder(binarySearchTree2.node);
		System.out.println("--------------------------");
		
	}

}
