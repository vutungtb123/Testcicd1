package service;
import entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public List<SinhVien> getAll() {
        return sinhVienList;
    }

    public SinhVien findByMaSV(String maSV) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public String addSinhVien(SinhVien sv) {
        if((sv.getMaSV()==null)||sv.getTen()==null){
            return "Không được để trống";
        }
        sinhVienList.add(sv);
        return "Thêm thành công";
    }

    public void deleteSinhVien(String maSV) {
        sinhVienList.removeIf(sv -> sv.getMaSV().equals(maSV));
    }

    public void updateSinhVien(SinhVien svMoi, String maSV) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV().equals(maSV)) {
                sv.setTen(svMoi.getTen());
                sv.setChuyenNganh(svMoi.getChuyenNganh());
                sv.setTuoi(svMoi.getTuoi());
                sv.setKyHoc(svMoi.getKyHoc());
                sv.setDiemTrungBinh(svMoi.getDiemTrungBinh());
            }
        }
    }
}
