public class ContohThrow {
    static void cekUmur(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Umur harus minimal 18 tahun");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        cekUmur(16); // akan menimbulkan exception
    }
}
