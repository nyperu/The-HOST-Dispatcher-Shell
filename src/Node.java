
// Daha sonra, çift yönlü bağıl liste için bir sınıf oluşturalım
class Node {
    Process proses;
    Node next;
    Node prev;

    public Node(Process process) {
        this.proses = process;
    }
    public void delete() {
        // Önceki ve sonraki düğümler arasındaki bağı kes
        if (prev != null) {
            prev.next = next;
        }
        if (next != null) {
            next.prev = prev;
        }
    }
}
