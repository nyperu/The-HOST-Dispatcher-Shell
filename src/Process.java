public class Process {
    public int id;
    public int varisZamani;
    public int oncelik;
    public int calisacagiSure;
    public int olumAdimi;
    public int calistigiSure;
    public String Color;

    public String BackGround;

    public Process(int id, int varisZamani, int oncelik,int kalanZaman,String Color,String BackGround){
        this.id =0000+id;
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.calisacagiSure = kalanZaman;
        this.Color = Color;
        this.BackGround = BackGround;
        this.olumAdimi = varisZamani*-1;
        this.calistigiSure=0;
    }
    public int getId(){
        return this.id;
    }
    public void yeniBasladi(int saniye,int kalanSure){
        if(saniye<10)
            if(id<10)
                 System.out.println(Color + BackGround+ saniye + ".0000 sn proses basladi         (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
            else
                System.out.println(Color + BackGround+ saniye + ".0000 sn proses basladi        (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");

        if(saniye>=10)
            if(id<10)
                System.out.println(Color + BackGround+ saniye + ".0000 sn proses basladi        (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
            else
                System.out.println(Color + BackGround+ saniye + ".0000 sn proses basladi       (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
        this.olumAdimi=0;
    }
    public void bitti(int saniye,int kalanSure){
        if(saniye<10)
            if(id<10)
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses bitti           (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses bitti          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");

        if(saniye>=10)
            if(id<10)
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses bitti          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses bitti         (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");

    }
    public void yurutuluyor(int saniye,int kalanSure){
        this.olumAdimi=0;
        if(saniye<10)
            if(id<10)
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses yürütülüyor     (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses yürütülüyor    (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");

        if(saniye>=10)
            if (id<10)
                 System.out.println(Color+ BackGround +saniye + ".0000 sn proses yürütülüyor    (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses yürütülüyor   (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");

    }
    public void zamanAsimi(int saniye,int kalanSure){
        if(saniye<10)
            if(id<10)

                System.out.println(Color+ BackGround +saniye + ".0000 sn proses zaman asimi    (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses zaman asimi   (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
        if(saniye>=10)
            if (id<10)
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses zaman asimi    (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses zaman asimi   (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+" sn )"+ "\u001B[0m");

    }
    public void askida(int saniye,int kalanSure){
        this.olumAdimi=0;
        if(saniye<10)
            if(id<10)

                System.out.println(Color+ BackGround +saniye + ".0000 sn proses askida          (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses askida           (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
        if(saniye>=10)
            if (id<10)
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses askida         (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");
            else
                System.out.println(Color+ BackGround +saniye + ".0000 sn proses askida        (id:"+id+"  oncelik:"+oncelik+"  kalan sure:"+kalanSure+ " sn )"+"\u001B[0m");

    }
}
