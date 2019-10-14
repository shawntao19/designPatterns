package pattern.front.controller;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:13
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
