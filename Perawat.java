public class Perawat{
    public String id;
    public String nama;
    public String alamat;
    public String id_dokter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public Perawat(){}

    public void Perawat(){
        System.out.println("id Perawat     : "+getId());
        System.out.println("nama Perawat   : "+getNama());
        System.out.println("alamat Perawat : "+getAlamat());
        System.out.println("Id Dokter      : "+getId_dokter());
    }
}
