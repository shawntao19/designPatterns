package pattern.proxy.dynamic;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 16:13
 */
public class RealSubject implements Subject {
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
