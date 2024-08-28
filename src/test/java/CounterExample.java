public class CounterExample {
    public static void main(String[] args) {
        int count = 0;

        // 1'den 10'a kadar olan sayıları döngü ile gez
        for (int i = 1; i <= 10; i++) {
            count++;  // Sayaç her döngüde 1 artırılır
            System.out.println("Sayı: " + i + ", karesi: " + (i * i));
        }

        // Toplam işlem yapılan sayı miktarını yazdır
        System.out.println("Toplam işlem yapılan sayı miktarı: " + count);
    }
}
