package io.github.codephoria.myapp;

import androidx.fragment.app.Fragment;

public class MyActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new MyFragment();
    }
}
