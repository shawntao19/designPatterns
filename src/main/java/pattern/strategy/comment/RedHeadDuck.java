package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:27
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        //可飞
        flyBehavior = new FlyWithWings();
        //呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("看着像红头鸭");
    }

}
