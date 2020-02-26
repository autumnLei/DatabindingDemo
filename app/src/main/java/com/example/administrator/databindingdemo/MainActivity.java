package com.example.administrator.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.databindingdemo.databinding.ActivityMainBinding;
import com.example.administrator.databindingdemo.viewModel.ViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ViewModel viewModel = new ViewModel(this, binding);


//        Main main = new Main("lei", "123456", getDrawable(R.drawable.picture1));
//        binding.setMain(main);
//        binding.setHandler(new Handler());
//        //必须加这句 除oncreate外的Databinding语句才能生效
//        binding.setMainActivity(this);
    }

//    public void onClickPicture(View view){
//        Toast.makeText(view.getContext(), "hi", Toast.LENGTH_SHORT).show();
//        Main main = new Main("july", "123456", getDrawable(R.drawable.picture2));
//        binding.setMain(main);
//    }

}
