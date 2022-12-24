public class Dokter {
    public String id;
    public String nama;
    public String jam_kerja;

    public Dokter(){}
    public void Dokter(){
        System.out.println("id Dokter   : "+getId());
        System.out.println("nama Dokter : "+getNama());
        System.out.println("jam kerja   : "+getJam_kerja());
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJam_kerja() {
        return jam_kerja;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJam_kerja(String jam_kerja) {
        this.jam_kerja = jam_kerja;
    }
}
