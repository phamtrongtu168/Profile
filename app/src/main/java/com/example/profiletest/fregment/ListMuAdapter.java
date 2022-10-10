package com.example.profiletest.fregment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.profiletest.CauThu;
import com.example.profiletest.R;

import java.util.List;

public class ListMuAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CauThu> cauThuList;

    public ListMuAdapter(Context context, int layout, List<CauThu> cauThuList) {
        this.context = context;
        this.layout = layout;
        this.cauThuList = cauThuList;
    }

    @Override
    public int getCount() {
        return cauThuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class ViewHolder{
        TextView txtTen,txtDtu;
        ImageView imgadd;



    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txtTen =(TextView) view.findViewById(R.id.textviewHoTen);
            holder.txtDtu =(TextView) view.findViewById(R.id.quocgia);
            holder.imgadd =(ImageView) view.findViewById(R.id.img_cauthu);
            view.setTag(holder);



        }else
        {
            holder = (ViewHolder) view.getTag();

        }
        CauThu cauThu = cauThuList.get(i);
        holder.txtTen.setText(cauThu.getten());
        holder.txtDtu.setText(cauThu.getDtu());
        holder.imgadd.setImageResource(cauThu.getAdd());

        return view;
    }
}
