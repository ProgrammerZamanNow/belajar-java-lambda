package programmer.zaman.now.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {

    Consumer<String> consumer = value -> System.out.println(value);

    consumer.accept("Eko Kurniawan");

  }
}
