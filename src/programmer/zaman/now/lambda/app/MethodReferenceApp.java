package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
  public static void main(String[] args) {

    // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("eko"));
    System.out.println(predicateIsLowerCase.test("Eko"));

    // Method Reference di Parameter

    // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
    Function<String, String> functionUpper = String::toUpperCase;

    System.out.println(functionUpper.apply("Eko"));

  }

  public void run(){
    Predicate<String> predicateIsLowerCase = this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("eko"));
    System.out.println(predicateIsLowerCase.test("Eko"));
  }

  public void run2(){
    MethodReferenceApp app = new MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = app::isLowerCase;

    System.out.println(predicateIsLowerCase.test("eko"));
    System.out.println(predicateIsLowerCase.test("Eko"));
  }

  public boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
