public class Venom extends Hero implements Sifat{
boolean lengket = true;
    public Venom(String Varian, String Kesaktian, int Darah) {
        super(Varian, Kesaktian, Darah);
        System.out.println("Venom dengan varian " + Varian + " dengan kesaktian " + Kesaktian + " dengan total darah " + Darah + " telah terdaftar");
    }

    @Override
    public void melawan() {
        // TODO Auto-generated method stub
        System.out.println("Venom Melawan Musuh");
    }

    @Override
    public void mengelabuhi() {
        // TODO Auto-generated method stub
        System.out.println("Venom Mengelabuhi Musuh");
    }

    @Override
    public void terbang() {
        // TODO Auto-generated method stub
        System.out.println("Venom Terbang diatas Musuh");
    }
    
}