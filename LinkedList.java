public class LinkedList {
    //Fields
    private int size;
    private Node head;

    //Constructors
    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    //Methods
    public int size() {
        return this.size;
    }

    public String get(int index) {
        Node node = this.head;
        if (head == null | index > size-1) {
            throw new IndexOutOfBoundsException("invalid index");
        } else {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        return node.item;
    }

    public void set(int index, String val) {
        Node curr = this.head;
        if (head == null | index > size-1) {
            throw new IndexOutOfBoundsException("invalid index");
        } else {
            for (int i = 0; i < index; i++) {//IS this WRONG?
                curr = curr.next;
            }
            curr.item = val;
        }
    }

    public void add(String val) {
        this.size++;
        Node node = new Node();
        node.item = val;

        Node curr = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            this.size = 1;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
            node.next = null;
        }
    }

    public void insert(int index, String val) {
        this.size++;

    }

    public void remove(int index) {
        this.size--;
        Node curr = this.head;
        Node prev = null;
        if (head == null || index > size - 1) {
            throw new IndexOutOfBoundsException("invalid index");
        } else {
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
    }

    public boolean find(String val) {
        Node node = this.head;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (node.item.equals(val)) {
                found = true;
                break;
            }
            node = node.next;
        }
        
        return found;
    }
}