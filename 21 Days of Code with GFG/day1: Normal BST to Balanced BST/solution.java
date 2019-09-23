/*This is a function problem.You only need to complete the function given below*/

/*class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    Node buildBalancedTree(Node root) 
    {
        ArrayList<Integer> inOrder = getInorder(root);
        int n = inOrder.size();
        Node node = constructTree(inOrder,0,n-1);
        return node;
    }
    
    private ArrayList<Integer> getInorder(Node node) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> s = new Stack<>();
        while(node != null || !s.isEmpty()) {
            if(node == null) {
                Node temp = s.pop();
                list.add(temp.data);
                node = temp.right;
            } else {
                s.push(node);
                node = node.left;
            }
        }
        return list;
    }
    
    private Node constructTree(ArrayList<Integer> list, int l, int r) {
        if(l > r) {
            return null;
        }
        
        int mid = (l+r)/2;
        
        Node node = new Node(list.get(mid));
        node.left = constructTree(list,l,mid-1);
        node.right = constructTree(list,mid+1,r);
        
        return node;
    }
}
