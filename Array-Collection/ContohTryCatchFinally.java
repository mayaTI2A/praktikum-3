public class ContohTryCatchFinally {
    public static void main(String[] args) {
        try {
            int angka = 10 / 0; // ERROR: pembagian dengan nol
            System.out.println("Hasil: " + angka);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Bagian finally selalu dijalankan");
        }
    }
}
