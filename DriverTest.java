package Project3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class DriverTest {
    @Test
    public void BinaryTreePostOrder(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals("DEBGFCA", test.postOrder(test.getRootNode()));
    }
    @Test
    public void BinaryNodePostOrder(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals("DEBGFCA", test.getRootNode().postOrderTraverse());
    }
    @Test
    public void BinaryNodePostOrder2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals("BFDGHECA", test.getRootNode().postOrderTraverse());
    }
	@Test
    public void BinaryTreePostOrder2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals("BFDGHECA", test.postOrder(test.getRootNode()));
    }
	@Test
    public void BinaryTreeHeight(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals(4, test.getHeight());
    }
	@Test
    public void BinaryTreeNodes(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals(8, test.getNumberOfNodes());
    }
	@Test
    public void BinaryTreeNodes2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals(7, test.getNumberOfNodes());
    }
	@Test
    public void BinaryTreeHeight2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals(4, test.getHeight());
    }
	@Test
    public void BinaryNodes2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals(7, test.getNumberOfNodes_callBinaryNodeMethod());
    }
	@Test
    public void BinaryNodeHeight2(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree1(test);
        assertEquals(4, test.getHeight_callBinaryNodeMethod());
    }
	@Test
	public void BinaryNodes(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals(8, test.getNumberOfNodes_callBinaryNodeMethod());
    }
	@Test
    public void BinaryNodeHeight(){
        BinaryTree<String> test = new BinaryTree<>();
        createTree2(test);
        assertEquals(4, test.getHeight_callBinaryNodeMethod());
    }
    public static void createTree1(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nGiven Tree:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\  ");
      System.out.println("  B     C  ");
      System.out.println(" / \\   /  ");
      System.out.println("D   E  F   ");
      System.out.println("        \\ ");
      System.out.println("         G ");
      System.out.println();
	}
    public static void createTree2(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");
		// SubTrees:
		BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);
		tree.setTree("A", bTree, cTree);
		System.out.println("\nGiven Tree:\n");
		System.out.println("     A      ");
		System.out.println("   /   \\  ");
		System.out.println("  B     C  ");
		System.out.println("        / \\  ");
		System.out.println("        D  E");
		System.out.println("       /   / \\");
		System.out.println("       F   G   H");
		System.out.println();
	}
}
