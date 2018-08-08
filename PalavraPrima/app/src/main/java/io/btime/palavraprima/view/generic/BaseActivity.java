package io.btime.palavraprima.view.generic;


import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity<T> extends AppCompatActivity {

    protected T presenter;

    @Override
    protected void onStart() {
        super.onStart();
        ButterKnife.bind(this);
    }

    protected abstract void initActivityFields();

}
