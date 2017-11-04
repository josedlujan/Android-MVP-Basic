package mvpexample.com.mvpexamplle;

/**
 * Created by jose on 03/11/17.
 */

public interface MainActivity {
    interface  View{
        void showResult(String s);
    }

    interface  Presenter{
        void showResultP(String s);
        void addName(String s);
    }

    interface Model{
        void addNameM(String s);
    }
}
