# HackJava
 This code hacks Java. It should print 4, but  it doesnt.
```java
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        hackJava();
        System.out.printf("%d", 2 + 2);
    }
    
    public static void hackJava()throws Exception{
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = 5;
    }
}

```
## Output:
```
5
```