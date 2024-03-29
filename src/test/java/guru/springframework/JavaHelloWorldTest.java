package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    JavaHelloWorld obj = new JavaHelloWorld();
    @Test
    void getHello() {
        assert(obj.getHello()).equals("Hello World");
        System.out.println("My unit test is running via junit 5");

    }
}