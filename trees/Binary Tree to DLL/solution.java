/*This is a function problem.You only need to complete the function given below*/
/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/
// This function should convert a given Binary tree to Doubly
// Linked List
class GfG
{
    Node head;
    ArrayList<Integer> inOrder = new ArrayList<Integer>();
    Node bToDLL(Node root) {
	    getInorder(root);
	    
	    Node prev = null;
	    Node head = convertDLL(null,0);
	    return head;
    }
    
    private void getInorder(Node node) {
        Stack<Node> s = new Stack<>();
        while(node != null || !s.isEmpty()) {
            if(node == null) {
                Node temp = s.pop();
                inOrder.add(temp.data);
                node = temp.right;
            } else {
                s.push(node);
                node = node.left;
            }
        }
    }
    
    private Node convertDLL(Node prev, int i) {
        if(i >= inOrder.size()) {
            return null;
        }
        
        Node temp = new Node(inOrder.get(i));
        temp.left = prev;
        temp.right = convertDLL(temp,i+1);
        return temp;
    }
}
