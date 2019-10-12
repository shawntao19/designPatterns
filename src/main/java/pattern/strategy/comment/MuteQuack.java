package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:26
 */
public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("我不会叫……");
    }
}
