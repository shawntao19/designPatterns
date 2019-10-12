package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:25
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱呱~");
    }
}

