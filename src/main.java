public class main {
    public static void main(String[] args) {

        DoublyLinkedList tumListe = new DoublyLinkedList();
        Dosya dosya = new Dosya();
        DoublyLinkedList p0 = new DoublyLinkedList();
        DoublyLinkedList p1 = new DoublyLinkedList();
        DoublyLinkedList p2 = new DoublyLinkedList();
        DoublyLinkedList p3 = new DoublyLinkedList();
        Node node;
        Node nodeTutucu;

        //Process p = new Process(1,0,0,5,"\u001B[35m");
        //deneme yorum satiri


        int oncelik;
        tumListe=dosya.Oku(args[0]);
        //onceliklerine göre listelere atılıyor...
        for (int i=0;i<tumListe.size;i++){
            oncelik = tumListe.head.proses.oncelik;
           if(oncelik==0){
               node= new Node(tumListe.head.proses);
               p0.addLast(node);
           }
            if(oncelik==1){
                node= new Node(tumListe.head.proses);
                p1.addLast(node);
            }
            if(oncelik==2){
                node= new Node(tumListe.head.proses);
                p2.addLast(node);
            }
            if(oncelik==3){
                node= new Node(tumListe.head.proses);
                p3.addLast(node);
            }
            tumListe.sonraki();
        }



        int yenimiBasladi=0;
        int calistigiSure=0;
        int calisacagiSure=0;
        int gercekZaman = 0;
        int gercekZamanIcerideArtmadi=0;
        while(true){
            gercekZamanIcerideArtmadi=0;
            if (p0.head!=null) {
                if (p0.head.proses.varisZamani <= gercekZaman) {
                    calisacagiSure = p0.head.proses.calisacagiSure;
                    calistigiSure = p0.head.proses.calistigiSure;
                    yenimiBasladi = calisacagiSure - calistigiSure;
                    if (yenimiBasladi == calisacagiSure) {
                        p0.head.proses.yeniBasladi(gercekZaman, yenimiBasladi);
                        p0.head.proses.calistigiSure++;
                        gercekZaman++;
                    } else if (yenimiBasladi < calisacagiSure && yenimiBasladi > 0) {
                        p0.head.proses.yurutuluyor(gercekZaman, yenimiBasladi);
                        p0.head.proses.calistigiSure++;
                        gercekZaman++;
                    }
                    calisacagiSure = p0.head.proses.calisacagiSure;
                    calistigiSure = p0.head.proses.calistigiSure;
                    yenimiBasladi = calisacagiSure - calistigiSure;
                    if (yenimiBasladi == 0) {
                        p0.head.proses.bitti(gercekZaman, yenimiBasladi);
                        p0.sonraki();
                    }
                    p0.olumDegeriArttir(p0,p1,p2,p3,gercekZaman);
                    continue;
                }
                else
                    gercekZamanIcerideArtmadi++;
            }

            if (p1.head!=null) {
                if (p1.head.proses.varisZamani <= gercekZaman) {
                    calisacagiSure = p1.head.proses.calisacagiSure;
                    calistigiSure = p1.head.proses.calistigiSure;
                    yenimiBasladi = calisacagiSure - calistigiSure;
                    if (yenimiBasladi == calisacagiSure) {
                        p1.head.proses.yeniBasladi(gercekZaman, yenimiBasladi);
                        p1.head.proses.calistigiSure++;
                        gercekZaman++;
                        calisacagiSure = p1.head.proses.calisacagiSure;
                        calistigiSure = p1.head.proses.calistigiSure;
                        yenimiBasladi = calisacagiSure - calistigiSure;
                        if (yenimiBasladi == 0) {
                            p1.head.proses.bitti(gercekZaman, yenimiBasladi);
                            p1.sonraki();
                        } else {//asagi yollanacak
                            p1.head.proses.oncelik = 2;
                            p1.head.proses.askida(gercekZaman, yenimiBasladi);
                            nodeTutucu= new Node(p1.head.proses);
                            p2.arayaEkle(nodeTutucu,gercekZaman);//p2 listesinde , soldan sağa giderken
                            // ilk şuanki zamandan büyük , gelme zamanı olanın
                            //soluna eklenecektir.
                            p1.sonraki();
                        }
                    }
                    p0.olumDegeriArttir(p0,p1,p2,p3,gercekZaman);
                     continue;
                }
                else
                    gercekZamanIcerideArtmadi++;
            }
            if (p2.head!=null) {
                if (p2.head.proses.varisZamani <= gercekZaman) {
                    calisacagiSure = p2.head.proses.calisacagiSure;
                    calistigiSure = p2.head.proses.calistigiSure;
                    yenimiBasladi = calisacagiSure - calistigiSure;
                    if (yenimiBasladi == calisacagiSure) { //yeni basladiysa olacaklar
                        p2.head.proses.yeniBasladi(gercekZaman, yenimiBasladi);
                        p2.head.proses.calistigiSure++;
                        gercekZaman++;
                        calisacagiSure = p2.head.proses.calisacagiSure;
                        calistigiSure = p2.head.proses.calistigiSure;
                        yenimiBasladi = calisacagiSure - calistigiSure;
                        if (yenimiBasladi == 0) {
                            p2.head.proses.bitti(gercekZaman, yenimiBasladi);
                            p2.sonraki();
                        } else {//asagi yollanacak __ kodlar yazılacak.
                            p2.head.proses.oncelik = 3;
                            p2.head.proses.askida(gercekZaman, yenimiBasladi);
                            nodeTutucu= new Node(p2.head.proses);
                            p3.arayaEkle(nodeTutucu,gercekZaman);//p2 listesinde , soldan sağa giderken
                            // ilk şuanki zamandan büyük , gelme zamanı olanın
                            //soluna eklenecektir.
                            p2.sonraki();
                        }
                    }
                    else if((calisacagiSure> calistigiSure)){
                        p2.head.proses.yurutuluyor(gercekZaman, yenimiBasladi);
                        p2.head.proses.calistigiSure++;
                        gercekZaman++;
                        calisacagiSure = p2.head.proses.calisacagiSure;
                        calistigiSure = p2.head.proses.calistigiSure;
                        yenimiBasladi = calisacagiSure - calistigiSure;
                        if (yenimiBasladi == 0) {
                            p2.head.proses.bitti(gercekZaman, yenimiBasladi);
                            p2.sonraki();
                        } else {//asagi yollanacak __ kodlar yazılacak.
                            p2.head.proses.oncelik = 3;
                            p2.head.proses.askida(gercekZaman, yenimiBasladi);
                            nodeTutucu= new Node(p2.head.proses);
                            p3.arayaEkle(nodeTutucu,gercekZaman);//p2 listesinde , soldan sağa giderken
                            // ilk şuanki zamandan büyük , gelme zamanı olanın
                            //soluna eklenecektir.
                            p2.sonraki();
                        }
                    }
                    p0.olumDegeriArttir(p0,p1,p2,p3,gercekZaman);
                    continue;
                }
                else
                    gercekZamanIcerideArtmadi++;

            }
            if (p3.head!=null) {
                if (p3.head.proses.varisZamani <= gercekZaman) {
                    calisacagiSure = p3.head.proses.calisacagiSure;
                    calistigiSure = p3.head.proses.calistigiSure;
                    yenimiBasladi = calisacagiSure - calistigiSure;
                    if (yenimiBasladi == calisacagiSure) {
                        p3.head.proses.yeniBasladi(gercekZaman, yenimiBasladi);
                        p3.head.proses.calistigiSure++;
                        gercekZaman++;

                        calisacagiSure = p3.head.proses.calisacagiSure;
                        calistigiSure = p3.head.proses.calistigiSure;
                        yenimiBasladi = calisacagiSure - calistigiSure;
                        if (yenimiBasladi == 0) {
                            p3.head.proses.bitti(gercekZaman, yenimiBasladi);
                            p3.deleteNode(p3.head);
                        }
                        else{
                            p3.head.proses.askida(gercekZaman, yenimiBasladi);
                            nodeTutucu=new Node(p3.head.proses);
                            p3.arayaEkle(nodeTutucu,gercekZaman);
                            p3.deleteNode(p3.head);
                        } //dugumu sona tasıyıp her şeyi bir sola kaydıracağız.

                    } else if (yenimiBasladi < calisacagiSure && yenimiBasladi > 0) {
                        p3.head.proses.yurutuluyor(gercekZaman, yenimiBasladi);
                        p3.head.proses.calistigiSure++;
                        gercekZaman++;
                        calisacagiSure = p3.head.proses.calisacagiSure;
                        calistigiSure = p3.head.proses.calistigiSure;
                        yenimiBasladi = calisacagiSure - calistigiSure;
                        if (yenimiBasladi == 0) {
                            p3.head.proses.bitti(gercekZaman, yenimiBasladi);
                            p3.deleteNode(p3.head);
                        }
                        else{

                            p3.head.proses.askida(gercekZaman, yenimiBasladi);
                            nodeTutucu=new Node(p3.head.proses);
                            p3.arayaEkle(nodeTutucu,gercekZaman);
                            p3.deleteNode(p3.head);

                        } //dugumu sona tasıyıp her şeyi bir sola kaydıracağız.
                    }
                    p0.olumDegeriArttir(p0,p1,p2,p3,gercekZaman);
                    continue;
                }
                else
                    gercekZamanIcerideArtmadi++;
            }
            if (gercekZamanIcerideArtmadi==4){
                p0.olumDegeriArttir(p0,p1,p2,p3,gercekZaman);
                System.out.println(gercekZaman + "  Süresinde proses yoktu.");
                gercekZaman++;
            }
            if(p0.IsEmpty() && p1.IsEmpty() && p2.IsEmpty() && p3.IsEmpty())
                break;


        }


    }
}


