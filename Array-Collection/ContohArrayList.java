import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        // Menambahkan data
        daftarNama.add("Maya");
        daftarNama.add("Dwi");
        daftarNama.add("Putri");
        // Mengakses elemen
        System.out.println("Nama pertama: " + daftarNama.get(0));
        // Menghapus elemen
        daftarNama.remove("Dwi");
        // Menampilkan seluruh elemen
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
