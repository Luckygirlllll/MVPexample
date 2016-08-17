package com.example.iryna.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iryna.daggerexample.DI.MainActivityModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.btGet)
    Button btGet;
    @BindView(R.id.btSet)
    Button btnSet;
    @BindView(R.id.etInsertText)
    EditText etInsertText;
    @BindView(R.id.tvShowText)
    TextView tvShowTextt;

    @Inject
    MainPresenter mMainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        App.getInstance(this).getAppComponent().plus(new MainActivityModule(this)).inject(this);
    }

    @OnClick(R.id.btGet)
    public void getText(){
        mMainPresenter.getData();
    }

    @OnClick(R.id.btSet)
    public void setText(){
        mMainPresenter.addDate(etInsertText.getText().toString());
    }

    @Override
    public void done() {
        Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show();
        etInsertText.setText("");
    }

    @Override
    public void showData(String data) {
        tvShowTextt.setText(data);
    }
}
