import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    private static ArrayList<Node> list1 = new ArrayList<>();
    private static ArrayList<Node> list2 = new ArrayList<>();

	public static Node lca(Node root, int v1, int v2) {
        ArrayList<Node> temp = new ArrayList<>();
        search(root,v1,v2,temp);
        int n1 = list1.size();
        int n2 = list2.size();
        int n = Math.min(n1,n2);
        Node prev = list1.get(0);

        //Debugging
        /*for(Node i: list1) {
            System.out.println(i.data);
        }
        System.out.print("\n");
        for(Node i: list2) {
            System.out.println(i.data);
        }
        System.out.print("\n");*/

        for(int i=0; i<n; i++) {
            if(list1.get(i).data != list2.get(i).data) {
               break;
            }
            prev = list1.get(i);
        }
        return prev;
    }

    private static boolean findV1 = false;
    private static boolean findV2 = false;
    private static void search(Node node, int v1, int v2, ArrayList<Node> temp) {
        if(node == null || (findV1 && findV2)) {
            return;
        }
        temp.add(node);
        if(node.data == v1) {
            list1 = new ArrayList<Node>(temp);
            findV1 = true;
        }
        if(node.data == v2) {
            list2 = new ArrayList<Node>(temp);
            findV2 = true;
        }
        search(node.left,v1,v2,new ArrayList<Node>(temp));
        search(node.right,v1,v2,new ArrayList<Node>(temp));
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}
