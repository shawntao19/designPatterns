package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:25
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("我不能飞……");
    }
}