package com.example.a23rd_sept_class_work;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter2 extends BaseAdapter {

    private Context objContext;
    public String [] abc ={"Name 1","Name 2","Name 3","Name 4","Name 5"};

    public ListAdapter2(Context context)
    {

        objContext=context;
    }
    @Override
    public int getCount() {
        return abc.length;
    }

    @Override
    public Object getItem(int i) {
        return abc[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView t1=new TextView(objContext);
        t1.setText(abc[i]);
        t1.setLayoutParams(new ViewGroup.LayoutParams(200,200));

        return t1;
    }
}