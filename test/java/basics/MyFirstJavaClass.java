package basics;

import org.junit.jupiter.api.Test;

public class MyFirstJavaClass {
    public int sumTwoDigits( int a, int b){
        int c = a+ b;
        return c;
    }

    public int minus(int a, int b){
        // int c = a - b;
        return a - b;
    }

    @Test
    public void test(){
        int a = sumTwoDigits(5, 16);
        int b = minus(6, 10);

        System.out.println(a);
        System.out.println(b);
    }
}


