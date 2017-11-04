package mvpexample.com.mvpexamplle.models;

import mvpexample.com.mvpexamplle.MainActivity;

/**
 * Created by jose on 03/11/17.
 */

public class MainActivityModel implements MainActivity.Model{
    private MainActivity.Presenter presenter;
    private String data;

    public  MainActivityModel(MainActivity.Presenter presenter){
        this.presenter = presenter;
    }


    @Override
    public void addNameM(String s) {
        data = s + "Agregar José";
        presenter.showResultP(data);
    }
}
