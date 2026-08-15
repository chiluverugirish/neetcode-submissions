class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class MyLinkedList {
    Node head, tail;
    int len;

    public MyLinkedList() {
        head = null;
        tail = null;
        len = 0;
    }

    public int get(int i) {
        if (i < 0 || i >= len) {
            return -1;
        }

        // Traverse from the closer end
        if (i < len / 2) {
            Node cur = head;
            for (int j = 0; j < i; j++) {
                cur = cur.next;
            }
            return cur.val;
        } else {
            Node cur = tail;
            for (int j = len - 1; j > i; j--) {
                cur = cur.prev;
            }
            return cur.val;
        }
    }

    public void addAtHead(int val) {
        Node nn = new Node(val);

        if (len == 0) {
            head = tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }

        len++;
    }

    public void addAtTail(int val) {
        Node nn = new Node(val);

        if (len == 0) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }

        len++;
    }

    public void addAtIndex(int index, int val) {
        // Valid: 0 <= index <= len
        if (index < 0 || index > len) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == len) {
            addAtTail(val);
            return;
        }

        Node cur = head;

        // Move to node currently at index
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        Node nn = new Node(val);

        // Insert nn before cur
        nn.prev = cur.prev;
        nn.next = cur;

        cur.prev.next = nn;
        cur.prev = nn;

        len++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= len) {
            return;
        }

        if (len == 1) {
            head = null;
            tail = null;
            len = 0;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.prev = null;
            len--;
            return;
        }

        if (index == len - 1) {
            tail = tail.prev;
            tail.next = null;
            len--;
            return;
        }

        Node cur = head;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;

        len--;
    }
}