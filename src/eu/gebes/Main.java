package eu.gebes;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        fuckJava();
        System.out.printf("%d", 2 + 2);
    }

    public static void hac()throws Exception{
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = 5;
    }
}
