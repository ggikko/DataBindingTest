package ggikko.me.databindingtestapp.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ggikko on 2016. 11. 13..
 */

public class TestModel extends BaseObservable{

    public Integer count = 5;

    @Bindable
    public Integer getCount() {
        return count;
    }

    @Bindable
    public void setCount(Integer count) {
        this.count = count;
        notifyPropertyChanged(this.count);
    }
}
