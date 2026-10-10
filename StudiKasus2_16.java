import java.util.Scanner;

public class StudiKasus2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisKegiatan;
        int dokumen;
        int juara;
        int status;
        int kurang;

        System.out.print("Masukkan nama :");
        String nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya):");
        jenisKegiatan = sc.nextLine();
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri") ) {
            System.out.print("Masukkan posisi juara :");
            juara = sc.nextInt();

            if (juara <= 3 && juara >= 1 ) {
                System.out.print("Masukkan jumlah dokumen :");
                dokumen = sc.nextInt();

                if (dokumen == 4 ) {
                    System.out.println("Dana penghargaan diberikan");
                } else {
                    kurang = 4 - dokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + kurang + " dokumen)");
                    System.out.println("Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Dana penghargaan tidak diberikan");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM(0 = tidak lulus, 1 = lulus) :");
            status = sc.nextInt();

            if (status == 1) {
                System.out.print("Masukkan jumlah dokumen :");
                dokumen = sc.nextInt();

                if (dokumen == 4 ) {
                    System.out.println("Dana penghargaan diberikan");
                } else {
                    kurang = 4 - dokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + kurang + " dokumen)");
                    System.out.println("Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Dana penghargaan tidak diberikan");
            }
        } else {
            System.out.println("Dana penghargaan tidak diberikan");
        }

        sc.close();
    }
}
