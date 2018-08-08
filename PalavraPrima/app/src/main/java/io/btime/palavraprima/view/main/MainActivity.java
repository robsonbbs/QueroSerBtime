package io.btime.palavraprima.view.main;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import io.btime.palavraprima.R;
import io.btime.palavraprima.contract.MainContract;
import io.btime.palavraprima.presenter.main.MainPresenter;
import io.btime.palavraprima.util.AndroidResourceManager;
import io.btime.palavraprima.view.generic.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.edtWord)
    EditText edtWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActivityFields();
    }

    @Override
    public void initActivityFields() {
        presenter = new MainPresenter(this, new AndroidResourceManager(this));
    }

    @OnClick(R.id.btnVerify)
    public void verifyWord() {
        presenter.onButtonClicked(edtWord.getText().toString());
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
