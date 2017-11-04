package mvpexample.com.mvpexamplle.presenters;

import mvpexample.com.mvpexamplle.MainActivity;
import mvpexample.com.mvpexamplle.models.MainActivityModel;

/**
 * Created by jose on 03/11/17.
 */

public class MainActivityPresenter  implements MainActivity.Presenter{

    private MainActivity.View view;
    private MainActivity.Model model;


    public MainActivityPresenter(MainActivity.View view){
        this.view = view;
        model = new MainActivityModel(this);

    }

    @Override
    public void showResultP(String s) {
        if(view!=null){
            view.showResult(s);
        }
    }

    @Override
    public void addName(String s) {
        if (view!= null){
            model.addNameM(s);
        }
    }
}
