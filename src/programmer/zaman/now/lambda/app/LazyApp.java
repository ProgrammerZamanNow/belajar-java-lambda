package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
  public static void main(String[] args) {
    testScore(60, () -> getName());
  }

  public static void testScore(int score, Supplier<String> name) {
    if (score > 80) {
      System.out.println("Selamat " + name.get() + ", Anda Lulus");
    } else {
      System.out.println("Coba Lagi Tahun Depan");
    }
  }

  public static String getName(){
    System.out.println("Method getName() dipanggil");
    return "Eko";
  }
}
