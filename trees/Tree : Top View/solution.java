public static void topView(Node root) {
        class Data {
            Node node;
            int dist;
            Data(Node node, int dist) {
                this.node = node;
                this.dist = dist;
            }
        }    

        Map<Integer,Node> map = new TreeMap<>();
        Queue<Data> q = new LinkedList<>();
        if(root == null) {
            return;
        } else {
            q.add(new Data(root,0));
        }
        
        while(!q.isEmpty()) {
            Data data = q.remove();
            if(!map.containsKey(data.dist)) {
                map.put(data.dist,data.node);
            }
            if(data.node.left != null) {
                q.add(new Data(data.node.left, data.dist-1));
            }
            if(data.node.right != null) {
                q.add(new Data(data.node.right, data.dist+1));
            }

        }
        for(Node node: map.values()) {
            System.out.print(node.data+" ");
        }    
    }
