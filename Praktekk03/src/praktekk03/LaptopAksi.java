
package praktekk03;

public class LaptopAksi {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        
        l.setMerk("Asus");
        l.setWarna("Putih");
        l.setHarga("4500000");
        
        l.cetakInfo();
        
        System.out.println("Merknya \t: ");
        System.out.println(l.getMerk());
        System.out.println("Warnanya \t: ");
        System.out.println(l.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(l.getHarga());
        
        
        Notebook n = new Notebook();
        n.setMerk("Axio");
        n.setWarna("Hitam");
        n.setHarga("2500000");
        n.setJenisNotebook("Baru");
        n.cetakInfo();
        System.out.println("Jenis \t:"+n.getJenisNotebook());
        n.throttle();
    }
}
