public class CycleLinkedList {
    public static class Node {
        int data;
        Node next;
        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList1 {
        public Node head;
        public Node tail;
        // adding a node at the beginning of the linkedlist
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // adding a node at the end of the linkedlist
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;    
            tail = newNode; 
        }
      
        // deleting the first node of the linkedlist
        public int deleteFirst() {
            if (head == null){
                System.out.println("LinkedList is Empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            head=head.next;
            return val;
        }
        // searching for a node in the linkedlist
        public int search(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }   
        
        //detect Cycle in a linkedlist
        public boolean isCycle(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;   
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;       
        }       
        // printing the linkedlist
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->"); 
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print(); 
        System.out.println(ll.isCycle());   
        ll.head.next.next.next.next.next = ll.head;
        System.out.println(ll.isCycle());   
    }
}