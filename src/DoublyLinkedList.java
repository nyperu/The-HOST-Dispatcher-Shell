class DoublyLinkedList {
    Node head;
    public int size;

    // Listenin sonuna bir nesne ekleme işlemi
    public void addLast(Node newNode) {
        // Listenin boş olduğunu kontrol edelim
        if (head == null) {
            head = newNode;
            size++;

        } else {
            // Listenin sonuna gidip, yeni nesneyi oraya ekleyelim
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            size++;
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void arayaEkle(Node newNode,int suankiZaman){


            // Liste boşsa, yeni düğümü head olarak ayarla
            if (head == null) {
                head = newNode;
                return;
            }

            // Değeri kendinden küçük olan ilk düğümü bul
            Node curr = head;
            while (curr.next != null && curr.proses.varisZamani <= suankiZaman) {
                curr = curr.next;
            }

            // Eğer bulunan düğüm varsa, yeni düğümü o düğümün soluna ekle
            if (curr.prev != null) {
                curr.prev.next = newNode;
                newNode.prev = curr.prev;
                newNode.next = curr;
                curr.prev = newNode;
            }
            // Eğer bulunan düğüm yoksa, yeni düğümü en sağa ekle
            else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                size++;
                current.next = newNode;
                newNode.prev = current;
            }
    }
    public void deleteNode(Node node) {
        // Eğer silinen düğüm liste başı ise, başın referansını
        // ikinci düğüme çevir
        if (node == head) {
            head = node.next;
        }
        // Düğümü yok et
        node.delete();
    }
    public void olumDegeriArttir(DoublyLinkedList p0,DoublyLinkedList p1,DoublyLinkedList p2,DoublyLinkedList p3,int gercekZaman) {
        // Düğümleri dolaşmak için geçici bir düğüm oluşturun
        Node currentP0 = p0.head;
        Node currentP1 = p1.head;
        Node currentP2 = p2.head;
        Node currentP3 = p3.head;
        int kalanSure=0;
        // Düğümleri dolaşmaya devam etmek için, geçici düğüm
        // son düğüme (null değere sahip düğüme) ulaşana kadar döngüyü sürdürün
        while (currentP0 != null) {
            // Düğümün değerini 1 arttırın
            currentP0.proses.olumAdimi += 1;

            // Geçici düğümü sonraki düğüme götürün
            currentP0 = currentP0.next;
        }
        while (currentP1 != null) {
            // Düğümün değerini 1 arttırın
            currentP1.proses.olumAdimi += 1;

            // Geçici düğümü sonraki düğüme götürün
            currentP1 = currentP1.next;
        }
        while (currentP2 != null) {
            // Düğümün değerini 1 arttırın
            currentP2.proses.olumAdimi += 1;

            // Geçici düğümü sonraki düğüme götürün
            currentP2 = currentP2.next;
        }
        while (currentP3 != null) {
            // Düğümün değerini 1 arttırın
            currentP3.proses.olumAdimi += 1;
            if(currentP3.proses.olumAdimi==20){
                kalanSure=currentP3.proses.calisacagiSure - currentP3.proses.calistigiSure;
                currentP3.proses.zamanAsimi(gercekZaman,kalanSure);
                currentP3.delete();
            }
            else{
                currentP3 = currentP3.next;
            }
            // Geçici düğümü sonraki düğüme götürün
        }

    }
    public boolean IsEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    public void sonraki() {
        // check if the list is empty
        if (head == null) {
            return;
        }

        // set the head of the list to the next node
        head = head.next;
    }
}