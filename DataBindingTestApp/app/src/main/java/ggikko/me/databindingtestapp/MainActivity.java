package ggikko.me.databindingtestapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ggikko.me.databindingtestapp.databinding.ActivityMainBinding;
import ggikko.me.databindingtestapp.model.TestModel;

public class MainActivity extends AppCompatActivity {

    private TestModel testModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        testModel = new TestModel();
        binding.setTestModel(testModel);
    }

    public void plusCount(View view){
        testModel.count = testModel.count + 1;
        testModel.setCount(testModel.count);
    }
}
