package org.example;

public class TinhTongMang {
public int tinhTong(int a[]){
    int tong=0;
    for(int i=0;i<a.length;i++){
        tong=tong+a[i];
    }
    return tong;
}
}
