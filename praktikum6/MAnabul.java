import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args){
        Anabul anabul1 = new Kucing("Meng");
        Anabul anabul2 = new Anjing("Maeumi");
        Burung anabul3 = new Burung("Odi");
        Kucing anabul4 = new Kucing("Cemong");

        ArrayList<Anabul> bul = new ArrayList<>();
        bul.add(anabul1);
        bul.add(anabul2);
        bul.add(anabul3);
        bul.add(anabul4);

        for(Anabul bulbul : bul){
            bulbul.tampilData();
            bulbul.Gerak();
            bulbul.Bersuara();
            System.out.println("\n");
        }
    }
}
