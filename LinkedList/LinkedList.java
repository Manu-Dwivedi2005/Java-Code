public class LinkedList {
    // creating a node
    public static class Node {
        int data;
        Node next;
        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // creating a linkedlist
    public static class LinkedList1 {
        public static Node head;
        public static Node tail;
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
        // adding a node at the middle of the linkedlist
        public void addMiddle(int data, int idx) {
            Node newNode = new Node(data);
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node temp = head;
            int i = 0;
            while (i < idx-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        // finding the size of the linkedlist
        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }   
        // deleting the last node of the linkedlist
        public int deleteLast() {
            if (size()==0){
                System.out.println("LinkedList is Empty");
                return Integer.MIN_VALUE;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp=temp.next;
            }
            int val = temp.next.data;
            temp.next=null;
            tail=temp;
            return val;
        }
        // deleting the first node of the linkedlist
        public int deleteFirst() {
            if (size()==0){
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
        // reversing the linkedlist
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        // finding the middle node of the linkedlist
        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
         }   
        // checking if the linkedlist is a palindrome
        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            Node midNode = findMid(head);
            Node prev = null;
            Node curr = midNode;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
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
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);  
        ll.print(); 
        ll.reverse();
        ll.print();
        ll.addMiddle(5, 2);
        ll.print();
        ll.deleteLast();
        ll.print();
        ll.deleteFirst();
        ll.print();
        System.out.println(ll.search(3));
        ll.reverse();
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addMiddle(3, 2);
        ll.print();
        System.out.println(ll.size());
        ll.deleteLast();
        ll.print();
        ll.deleteFirst();
        ll.print();
        System.out.println(ll.search(3));
        ll.reverse();
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addMiddle(3, 2);
        ll.print();
        System.out.println(ll.size());
        

    }
}
