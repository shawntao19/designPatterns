package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:26
 */
/**
 * 绿头鸭
 */
public class MallarDuck extends Duck{

    public MallarDuck() {
        //可飞
        flyBehavior = new FlyWithWings();
        //呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("看着像绿头鸭");
    }

}
