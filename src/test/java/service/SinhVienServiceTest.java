package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  entity.SinhVien;
import static org.junit.jupiter.api.Assertions.*;
public class SinhVienServiceTest {
    private SinhVienService service;

    @BeforeEach
    void setUp(){
        service= new SinhVienService();
    }

    @Test
    public void testAdd(){
        SinhVien sv1=new  SinhVien("SV1","Tung",19,1.5f,2,"CNTT");
        service.addSinhVien(sv1);
        assertEquals(1,service.getAll().size());
    }

    @Test
    public void testUpdate(){
        SinhVien sv1=new  SinhVien("SV1","Tung",19,1.5f,2,"CNTT");
        service.addSinhVien(sv1);


        SinhVien sv2=new
                SinhVien("SV1","Nghia",20,5.5f,6,"UDPM");
        service.updateSinhVien(sv2,"SV1");
        assertAll(
                ()-> assertEquals("Nghia",service.findByMaSV("SV1").getTen()),
                ()->assertEquals(20,service.findByMaSV("SV1").getTuoi()),
                ()->assertEquals(5.5f,service.findByMaSV("SV1").getDiemTrungBinh()),
                ()->assertEquals(6,service.findByMaSV("SV1").getKyHoc()),
                ()->assertEquals("UDPM",service.findByMaSV("SV1").getChuyenNganh())
        );
    }

    @Test
    public void testDelete(){
        SinhVien sv1=new  SinhVien("SV1","Tung",19,1.5f,2,"CNTT");
        service.addSinhVien(sv1);

        service.deleteSinhVien("SV1");
        assertEquals(0,service.getAll().size());
    }

    @Test
    public void testFindByMaSV(){
        SinhVien sv1=new  SinhVien("SV1","Tung",19,1.5f,2,"CNTT");
        service.addSinhVien(sv1);

        SinhVien svFound=service.findByMaSV("SV1");

        //assertEquals("SV1",svFound.getMaSV());

        assertAll(
                ()-> assertEquals("Tung",svFound.getTen()),
                ()->assertEquals(19,svFound.getTuoi()),
                ()->assertEquals(1.5f,svFound.getDiemTrungBinh()),
                ()->assertEquals(2,svFound.getKyHoc()),
                ()->assertEquals("CNTT",svFound.getChuyenNganh())
        );
    }

    @Test
    public void testValidate(){
        SinhVien sv1=new SinhVien();
        String message=service.addSinhVien(sv1);
        assertEquals("Không được để trống",message);
    }
}
