package pattern.state.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 12:14
 */
public abstract class Duck {
    public void swim() {
        System.out.println("All duck can swim!");
    }

    public abstract void display();

    public void fly() {
        System.out.println("飞~~~");
    }

    public void quack() {
        System.out.println("呱呱呱~");
    }
}
