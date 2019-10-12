package pattern.mediator.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 10:49
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
