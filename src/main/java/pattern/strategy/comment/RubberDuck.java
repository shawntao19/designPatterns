package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:27
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        //不会飞
        flyBehavior = new FlyNoWay();
        //吱吱叫
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("看着像橡皮鸭");
    }

}
