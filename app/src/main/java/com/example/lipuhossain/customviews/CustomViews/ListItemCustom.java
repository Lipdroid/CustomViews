package com.example.lipuhossain.customviews.CustomViews;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lipuhossain.customviews.R;

/**
 * Created by lipuhossain on 12/5/16.
 */

public class ListItemCustom extends RelativeLayout {
    View rootView;
    TextView title;
    ImageView image;

    public ListItemCustom(Context context) {
        super(context);
        init(context);
    }

    public ListItemCustom(Context context, int test, String hello) {
        super(context);
        rootView = inflate(context, R.layout.list_item,this);
        title = (TextView) rootView.findViewById(R.id.tv);
        image = (ImageView) rootView.findViewById(R.id.imageView);
        title.setText(hello);
        image.setImageResource(test);
    }

    private void init(Context context) {
        rootView = inflate(context, R.layout.list_item,this);
        title = (TextView) rootView.findViewById(R.id.tv);
        image = (ImageView) rootView.findViewById(R.id.imageView);
    }

    public ListItemCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }
    public void changeValue(int drawable,String text){
        image.setImageResource(drawable);
        title.setText(text);
    }


}
