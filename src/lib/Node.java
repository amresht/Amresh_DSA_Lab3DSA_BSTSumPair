/**
 * @class           Node Class 
 * @author          Amresh Tripathi 
 * @date            25-Apr-2023
 * @version         1.0
 */

package lib;

public class Node {
	public Node left;
	public int data;
	public Node right;
	
	public Node(int data)
	{
		this.left=null;
		this.data=data;
		this.right=null;
	}
}
