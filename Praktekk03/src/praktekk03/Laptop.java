
package praktekk03;

public class Laptop {
    private String Merk;
    private String Warna;
    private String Harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+Merk+"\n"+
                "Warna \t: "+Warna+"\n"+
                "Harga \t: "+Harga);
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    
     
}
