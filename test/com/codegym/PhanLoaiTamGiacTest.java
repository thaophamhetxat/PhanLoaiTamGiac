package com.codegym;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhanLoaiTamGiacTest {
    @org.junit.jupiter.api.Test
            void tamGiactest1(){
        double side1 = 9.0;
        double side2 = 5.0;
        double side3 = 6.0;
        String expected = "tam giac vuong";
        String result = PhanLoaiTamGiac.tamGiac(side1,side2,side3);
        assertEquals(expected,result);
    }


}