public class Gundala extends Hero implements Sifat{

    public Gundala(String Varian, String Kesaktian, int Darah) {
        super(Varian, Kesaktian, Darah);
        System.out.println("Gundala dengan Varian " + Varian + " dengan kesaktian " + Kesaktian + " dengan total darah " + Darah + " telah terdaftar");
    }

    @Override
    public void melawan() {
        // TODO Auto-generated method stub
        System.out.println("Gundala Melawan Musuh");
    }

    @Override
    public void mengelabuhi() {
        // TODO Auto-generated method stub
        System.out.println("Gundala Mengelabuhi Musuh");
    }

    @Override
    public void terbang() {
        // TODO Auto-generated method stub
        System.out.println("Gundala Terbang diatas Musuh");
    }
    
}