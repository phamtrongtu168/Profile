package com.example.profiletest;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import kotlin.text.UStringsKt;

public class CauThu {
    public String ten,dtu;
    public int add;

    public CauThu(String ten, String dtu, int add) {
        this.ten = ten;
        this.dtu = dtu;
        this.add = add;
    }

    public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public String getDtu() {
        return dtu;
    }

    public void setDtu(String dtu) {
        this.dtu = dtu;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
