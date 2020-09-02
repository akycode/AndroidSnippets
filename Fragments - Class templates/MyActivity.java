package io.github.akycode.myapp;

import androidx.fragment.app.Fragment;

public class MyActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new MyFragment();
    }
}