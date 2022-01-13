package com.example.a23rd_sept_class_work;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    private Context mContext;
    int j;
    //int, string, float are data types.

    public String[] Music= {"Electronic","Rock","Jazz","Classical","Corynorhinus"};

    public ListAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() { return Music.length; }

    @Override
    public Object getItem(int i) { return Music[i];}

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView t1= new TextView(mContext);
        t1.setText(Music[i]);
        t1.setLayoutParams(new ViewGroup.LayoutParams(250,150));
        return t1;
    }
}
