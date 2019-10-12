package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:27
 */
public class DuckDemo {

    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        System.out.println("========================");
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        System.out.println("========================");
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        //改变行为特点
        rubberDuck.setFlyBehavior(new FlyWithRocket());
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
