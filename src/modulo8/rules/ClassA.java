package modulo8.rules;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by pablomoreno on 28/05/15.
 */
public class ClassA {
    public void method() throws IOException {
        throw new IOException();
    }

    public void method2() throws IOException {
        method();
    }

    public void method3() {
        try {
            method();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ClassA classA = new ClassA();

    }
}

class B extends ClassA {
    @Override
    public void method() throws IOException {
        super.method();
    }
}
