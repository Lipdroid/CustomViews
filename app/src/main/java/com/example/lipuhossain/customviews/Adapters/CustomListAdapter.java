package com.example.lipuhossain.customviews.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.lipuhossain.customviews.CustomViews.ListItemCustom;
import com.example.lipuhossain.customviews.R;

/**
 * Created by lipuhossain on 12/5/16.
 */

public class CustomListAdapter extends BaseAdapter {
    private Context context = null;
    public CustomListAdapter(Context context) {
        this.context = context;
    }

    @Override

    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = new ListItemCustom(context,R.drawable.test,"Hello");
        return convertView;
    }
}
