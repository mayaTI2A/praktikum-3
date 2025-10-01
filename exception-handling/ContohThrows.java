import java.io.IOException; // <== tanpa public

public class ContohThrows {
    static void cekFile() throws IOException {
        throw new IOException("File tidak ditemukan");
    }

    public static void main(String[] args) {
        try {
            cekFile();
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
