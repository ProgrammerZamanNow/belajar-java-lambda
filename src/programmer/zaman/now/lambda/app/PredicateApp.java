package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
  public static void main(String[] args) {

    Predicate<String> predicateCheckBlank = value -> value.isBlank();

    System.out.println(predicateCheckBlank.test(""));
    System.out.println(predicateCheckBlank.test("Eko"));

  }
}
