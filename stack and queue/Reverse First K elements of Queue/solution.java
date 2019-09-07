//User function Template for Java
class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<k; i++) {
          s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q1.add(s.pop());
        }
        while(q.peek() != null) {
            q1.add(q.remove());
        }
        return q1;
    }
}

