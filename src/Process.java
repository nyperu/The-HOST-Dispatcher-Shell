public class Process {
    public int id;
    public int varisZamani;
    public int oncelik;
    public int calisacagiSure;
    public int olumAdimi;
    public int calistigiSure;
    public String Color;
    
    public Process(int id, int varisZamani, int oncelik,int kalanZaman,String Color){
        this.id =id;
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.calisacagiSure = kalanZaman;
        this.Color = Color;
        this.olumAdimi = varisZamani*-1;
        this.calistigiSure=0;
    }
    public int getId(){
        return this.id;
    }
    public void yeniBasladi(int saniye,int kalanSure){

        System.out.println(Color + saniye + ".0000 sn proses basladi      (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+")"+ "\u001B[0m");
        this.olumAdimi=0;
    }
    public void bitti(int saniye,int kalanSure){

        System.out.println(Color +saniye + ".0000 sn  proses bitti          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ "\u001B[0m");
    }
    public void yurutuluyor(int saniye,int kalanSure){
        this.olumAdimi=0;
        System.out.println(Color +saniye + ".0000 sn  proses calisiyor          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ "\u001B[0m");
    }
    public void zamanAsimi(int saniye,int kalanSure){

        System.out.println(Color +saniye + ".0000 sn  proses zaman asimi          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ "\u001B[0m");
    }
    public void askida(int saniye,int kalanSure){
        this.olumAdimi=0;
        System.out.println(Color +saniye + ".0000 sn  proses askida         (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ "\u001B[0m");
    }
}
