package com.gdj.myview.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.gdj.myview.R;
import com.gdj.myview.view.WaveView;
import com.gdj.myview.view.WaveView2;

/**
 * Comment:
 *
 * @author :DJ鼎尔东 / 1757286697@qq.cn
 * @version : Administrator1.0
 * @date : 2017/10/5
 */
public class PathStudyFragment extends Fragment  {

//    private LinearLayout linearLayout1, linearLayout2, linearLayout3, ll_container;
//    private int height1, height2, height3;
//    //  private WaterFalls mScrollViews;
//图片瀑布流ScrollView
//    int page;
//    int PAGE_COUNT = 16;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //performCreateView
        View rootView = inflater.inflate(R.layout.fragment_water_fall, null);
        ((WaveView)rootView.findViewById(R.id.waveview)).startAnimation();
        ((WaveView2)rootView.findViewById(R.id.waveview2)).startAnimation();

        return rootView;
    }
}
