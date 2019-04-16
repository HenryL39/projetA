package com.wunderit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
 
public class AppTest {
 
    @Test
    public void test() throws Exception {
        assertEquals(true, true);
    }

    @Ignore @Test
    public void test2() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void test3() throws Exception {
        assertEquals(false, true);
    }


}
