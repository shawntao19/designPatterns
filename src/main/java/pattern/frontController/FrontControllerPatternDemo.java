package pattern.frontController;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:14
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
