/*public class LinkedList extends Node{
    private Node head;  // head of the list
    public int elemanAdet;

    // nested class to define linked list node


    public void push(Process P) {
        Node newNode = new Node(P);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        elemanAdet++;
    }

    // method to remove a node from the front of the list
    public void pop() {
        // check if the list is empty
        if (head == null) {
            return;
        }

        // set the head of the list to the next node
        head = head.next;
    }

    public String peek(){
        if(head == null){
            return "Liste Boş";
        }

        return ( head.p.Color+
                "(ID :"+Integer.toString(head.p.id ) +
                "  Gelis Zamanı:" + Integer.toString(head.p.varisZamani )+
                "  -Oncelik :" + Integer.toString(head.p.oncelik )+
                "  -Kalan Zaman :" + Integer.toString(head.p.kalanZaman )+ "sn)");
    }



    // method to search for a node with a given value in the list
    public boolean Oncelik(int value) {
        // start from the head of the list
        Node current = head;

        // iterate through the list until the end is reached or the value is found
        while (current != null) {
            if (current.p.oncelik == value) {
                return true;
            }
            current = current.next;
        }

        // value was not found in the list
        return false;
    }

    /*public Process varisZamani(int value) {
        // start from the head of the list
        Node current = head;

        // iterate through the list until the end is reached or the value is found
        while (current != null) {
            if (current.p.varisZamani == value) {
                return true;
            }
            current = current.next;
        }

        // value was not found in the list
        return false;
    }

    public boolean IsEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}
*/