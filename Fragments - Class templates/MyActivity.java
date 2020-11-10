package io.github.happycoding-123.myapp;

import androidx.fragment.app.Fragment;

public class MyActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new MyFragment();
    }
}
