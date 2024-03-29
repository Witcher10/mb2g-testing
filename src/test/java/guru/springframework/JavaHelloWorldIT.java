package guru.springframework;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldIT {

    JavaHelloWorld obj = new JavaHelloWorld();

    @Test
    void getHello() {
        assert(obj.getHello()).equals("Hello World");
        System.out.println("My Integration test is running via junit 5");

    }
}
