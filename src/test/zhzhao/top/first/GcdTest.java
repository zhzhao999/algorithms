package zhzhao.top.first;

import org.junit.Test;

import static org.junit.Assert.*;

public class GcdTest {

    @Test
    public void gcd() {
        assertEquals(1,Gcd.gcd(10,3) );
        assertEquals(5,Gcd.gcd(10,5) );
    }
}