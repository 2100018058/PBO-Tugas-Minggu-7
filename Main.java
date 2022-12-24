import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dokter d = new Dokter();
        Perawat p = new Perawat();
        Pasien c = new Pasien();
        try {
            System.out.println("1. Input Dokter\n");
            System.out.println("Masukkan id Dokter   : ");
            d.id = input.nextLine();
            System.out.println("Masukkan nama Dokter : ");
            d.nama = input.nextLine();
            System.out.println("Masukkan jam kerja   : ");
            d.jam_kerja = input.nextLine();

            System.out.println("\n2. Input Perawat\n");
            System.out.println("Masukkan id Perawat     : ");
            p.id = input.nextLine();
            System.out.println("Masukkan nama Perawat   : ");
            p.nama = input.nextLine();
            System.out.println("Masukkan alamat Perawat : ");
            p.alamat = input.nextLine();
            p.setId_dokter("058");

            System.out.println("\n3. Input Pasien\n");
            System.out.println("Masukkan id pasien            : ");
            c.id = input.nextLine();
            System.out.println("Masukkan nama pasien          : ");
            c.nama = input.nextLine();
            System.out.println("Masukkan alamat pasien        : ");
            c.alamat = input.nextLine();
            System.out.println("Masukkan berat badan pasien   : ");
            c.bb = input.nextLine();
            System.out.println("Masukkan jenis kelamin pasien : ");
            c.jk = input.nextLine();

            System.out.println("Tampilan Data");
            System.out.println("Dokter\n");
            d.Dokter();
            System.out.println("\nPerawat\n");
            p.Perawat();
            System.out.println("\nPasien\n");
            c.Pasien();

            System.out.println("\n\nReceipt\n");
            System.out.println("Hari Rabu, 3 Okt 2022");
            System.out.println("14:20");
            System.out.println("id Dokter            : " + d.getId());
            System.out.println("nama Dokter          : " + d.getNama());
            System.out.println("id Perawat           : " + p.getId());
            System.out.println("nama Perawat         : " + p.getNama());
            System.out.println("id pasien            : " + c.getId());
            System.out.println("nama pasien          : " + c.getNama());
            System.out.println("alamat pasien        : " + c.getAlamat());
            System.out.println("berat badan pasien   : " + c.getBb());
            System.out.println("jenis kelamin pasien : " + c.getJk());
            System.out.println("Total Harga          : Rp 230.000,00");

            File file = new File("pbo.txt");
            PrintWriter inp = new PrintWriter(file);
            inp.println("\n\nReceipt\n");
            inp.println("Hari Rabu, 3 Okt 2022");
            inp.println("14:20");
            inp.println("id Dokter            : " + d.getId());
            inp.println("nama Dokter          : " + d.getNama());
            inp.println("id Perawat           : " + p.getId());
            inp.println("nama Perawat         : " + p.getNama());
            inp.println("id pasien            : " + c.getId());
            inp.println("nama pasien          : " + c.getNama());
            inp.println("alamat pasien        : " + c.getAlamat());
            inp.println("berat badan pasien   : " + c.getBb());
            inp.println("jenis kelamin pasien : " + c.getJk());
            inp.println("Total Harga          : Rp 230.000,00");
            inp.close();

        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            System.out.println("Read File");
            File open = new File("C:\\Users\\rafim\\IdeaProjects\\pbo\\pbo.txt");
            Scanner scan = new Scanner(open);
            while (scan.hasNextLine()) {
                String getDataString = scan.nextLine();
                System.out.println(getDataString);
            }
            scan.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}