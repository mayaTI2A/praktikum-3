import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();
        // Menambahkan data
        mahasiswa.put("TI001", "Maya");
        mahasiswa.put("TI002", "Dwi");
        mahasiswa.put("TI003", "Putri");
        // Mengakses value dengan key
        System.out.println("Mahasiswa TI001: " + mahasiswa.get("TI001"));
        // Menampilkan seluruh key-value
        for (String key : mahasiswa.keySet()) {
            System.out.println(key + " => " + mahasiswa.get(key));
        }
    }
}

