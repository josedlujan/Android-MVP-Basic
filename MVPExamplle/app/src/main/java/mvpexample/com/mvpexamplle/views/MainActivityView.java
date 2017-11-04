package mvpexample.com.mvpexamplle.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mvpexample.com.mvpexamplle.MainActivity;
import mvpexample.com.mvpexamplle.R;
import mvpexample.com.mvpexamplle.presenters.MainActivityPresenter;

public class MainActivityView extends AppCompatActivity implements MainActivity.View {
    TextView textView;
    EditText editText;
    private MainActivity.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        editText = (EditText) findViewById(R.id.edittext);
        presenter =  new MainActivityPresenter(this);

    }

    public void sendData(View view){
       presenter.addName(editText.getText().toString());
    }

    @Override
    public void showResult(String s){
        textView.setText(s);
    }
}
