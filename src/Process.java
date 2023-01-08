public class Process {
    public int id;
    public int varisZamani;
    public int oncelik;
    public int calisacagiSure;
    public int olumAdimi;
    public int calistigiSure;
    public String Color; // 8 adet rastgele renk üretilmektedir.

    public String BackGround; // 8 adet rast gele arka plan rengi üretilmektedir.
    //BU RENKLER ASLA ÇAKIŞMAMAKTADIR. 8*8'DEN 64 FARKLI PROSESS ID'Sİ İÇİN RENK KOMBİNASYONU YAPILMIŞTIR.

    public Process(int id, int varisZamani, int oncelik,int kalanZaman,String Color,String BackGround){
        this.id =0000+id;
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.calisacagiSure = kalanZaman;
        this.Color = Color;
        this.BackGround = BackGround;
        this.olumAdimi = varisZamani*-1; //ölüm adımından kasıt 20 saniyelik bekleme süresidir.
        //bu açlık süresi sanal olarak txt'den okunan verilerin her biri için artacağından dolayı
        //her prosesin gerçek zamanda gelebilmesinin sağlamak adına bütün proseslerin geliş zamanlarının negatifini alıyoruz.
        // ölüm adımı 0 olduğunda proses gerçekten de gerçek zamanda gelmiş olacaktır.
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
