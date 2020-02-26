package com.example.administrator.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.databindingdemo.BR;

/**
 * Created by Administrator on 2018/4/17.
 */

public class Main extends BaseObservable{

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();
    public ObservableField<Drawable> pictureURL = new ObservableField<>();

    public Main(String name, String password, Drawable pictureURL){
        this.name.set(name);
        this.password.set(password);
        this.pictureURL.set(pictureURL);
    }

    @Bindable
    public String getName() {
        return name.get();
    }

    @Bindable
    public String getPassword() {
        return password.get();
    }

    @Bindable
    public Drawable getPictureURL() {
        return pictureURL.get();
    }

    public void setPictureURL(Drawable pictureURL) {
        this.pictureURL.set(pictureURL);
        notifyPropertyChanged(BR.pictureURL);
    }

    public void setName(String name) {
        this.name.set(name);
        notifyPropertyChanged(BR.name);
    }

    public void setPassword(String password) {
        this.password.set(password);
        notifyPropertyChanged(BR.password);
    }

    public void onClickButton(View view){
        setName("july");
        Toast.makeText(view.getContext(), "main::onClickButton", Toast.LENGTH_SHORT).show();
    }
}
