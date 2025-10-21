public class DSA_33 {
    

    // Node class for singly linked list
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public DSA_33() {
        head = null;
        size = 0;
    }

    // Get value at index
    public  int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    // Add node at head
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    // Add node at tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    // Add node at specific index
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        size++;
    }

    // Delete node at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
    public class Main {
    public static void main(String[] args) {
        DSA_33 list = new DSA_33();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);  // List becomes 1->2->3
        System.out.println(list.get(1)); // Output: 2
        list.deleteAtIndex(1);  // List becomes 1->3
        System.out.println(list.get(1)); // Output: 3
    }
}
}

