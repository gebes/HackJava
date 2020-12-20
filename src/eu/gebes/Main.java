package eu.gebes;

import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) {
    doCalculation();
  }

  public static void doCalculation() {
    int a = 2;
    int b = 2;
    int sum = a + b;

    System.out.printf("Adding %d and %d which gives you %d", a, b, sum);

  }

  static {
    try {
      Class cache = Integer.class.getDeclaredClasses()[0];
      Field c = cache.getDeclaredField("cache");
      c.setAccessible(true);
      Integer[] array = (Integer[]) c.get(cache);
      array[132] = 5;
    } catch (Exception ignored) {
    }
  }
}
