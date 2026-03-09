package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TinhTongMangTest {
public  TinhTongMang tinhtongmang;
@BeforeEach
void  setUp(){
    tinhtongmang=new TinhTongMang();
}
    @Test
    void tinhTong1() {
int a[]={-1,-4,-22,-20,-9};
int kqThucTe=tinhtongmang.tinhTong(a);
int kqKyVong=-56;
assertEquals(kqKyVong,kqThucTe);
    }

    @Test
    void tinhTong2() {
    }

    @Test
    void tinhTong3() {
    }

}