package com.example.administrator.databindingdemo.viewModel;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.databindingdemo.R;
import com.example.administrator.databindingdemo.bean.Main;
import com.example.administrator.databindingdemo.databinding.ActivityMainBinding;

/**
 * Created by Administrator on 2018/4/20.
 */

public class ViewModel {

    public Main main;
    public Activity activity;
    public ActivityMainBinding activityMainBinding;

    public ViewModel(Activity activity, ActivityMainBinding activityMainBinding){
        this.activity = activity;
        this.activityMainBinding = activityMainBinding;
        init();
    }

    public void init(){
        activityMainBinding.setModel(this);
        main = new Main("july丶lei", "123456", activity.getDrawable(R.drawable.picture1));
    }

    public void onClickPicture(View view){
        main.setPictureURL(activity.getDrawable(R.drawable.picture2));
        Toast.makeText(view.getContext(), "viewModel::onClickPicture", Toast.LENGTH_SHORT).show();
    }

}
