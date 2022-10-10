package com.example.profiletest.fregment;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.profiletest.CauThu;
import com.example.profiletest.R;

import java.util.ArrayList;


public class ListMUFragment extends ListFragment {

    ArrayList<CauThu> arrayCauThu;
    ListMuAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        arrayCauThu = new ArrayList<>();
        addArCt();
        adapter = new ListMuAdapter(getActivity(),R.layout.cauthu,arrayCauThu);
        setListAdapter(adapter);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_m_u, container, false);
    }
    private void addArCt(){
        arrayCauThu.add(new CauThu("KaKá","Brasil",R.drawable.kaka));
        arrayCauThu.add(new CauThu("Cristiano Ronaldo","Bồ Đào Nha",R.drawable.rido));
        arrayCauThu.add(new CauThu("Lionel Messi","Argentina ",R.drawable.messi));
        arrayCauThu.add(new CauThu("Roberto Carlos","Brasil",R.drawable.caslos));
        arrayCauThu.add(new CauThu("Pelé","Brasil",R.drawable.pele));
        arrayCauThu.add(new CauThu("Ronaldo de Lima","Brasil",R.drawable.robeo));






    }
}