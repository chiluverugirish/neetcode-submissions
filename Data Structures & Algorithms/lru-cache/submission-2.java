// class Node{
//     int k;
//     int v;
//     int value;
//     Node(int a,int b){
//         k=a;
//      value=b;
//     }
// }
// class LRUCache {
//     Map<Integer,Node>mp;
//     int s;
//     PriorityQueue<Node>pq;
//     public LRUCache(int capacity) {
//         mp=new HashMap<>();
//         pq=new PriorityQueue<>((a,b)-> a.v-b.v);
//         s=capacity;
//     }
    
//     public int get(int key) {
//         if(!mp.containsKey(key))return -1;
//         Node k=mp.get(key);
//         k.v++;
//         return k.value;
//     }
    
//     public void put(int key, int value) {
//          if(s==mp.size()){
//             Node tmp=pq.poll();
//             mp.remove(tmp.k);
//         }
//             Node n=mp.getOrDefault(key,new Node(key,value));
//             n.v++;
//             mp.put(key,n);
//             pq.add(n);
//             return;

//     }
// }




















class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final Map<Integer, Node> map;
    private final int capacity;
    private final Node head, tail; // Dummy head and tail

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        
        Node node = map.get(key);
        remove(node);
        insertAtHead(node); // Mark as most recently used
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node existing = map.get(key);
            existing.value = value; // Update value
            remove(existing);
            insertAtHead(existing);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.prev; // Least recently used is right before tail
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertAtHead(newNode);
        }
    }

    // Helper: Detach node from linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper: Insert node right after dummy head
    private void insertAtHead(Node node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}
