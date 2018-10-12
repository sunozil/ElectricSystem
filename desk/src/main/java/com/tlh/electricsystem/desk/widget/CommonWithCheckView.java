package com.tlh.electricsystem.desk.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.tlh.electricsystem.desk.R;

/**
 * 组合控件-带单选框
 */
public class CommonWithCheckView extends LinearLayout {

    public CommonWithCheckView(Context context) {
        super(context);
        initView(context);
    }

    public CommonWithCheckView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public CommonWithCheckView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context){
        LayoutInflater.from(context).inflate(R.layout.item_common_with_check,this,true);
    }
}