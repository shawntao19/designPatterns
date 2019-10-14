package pattern.visitor.other;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 10:00
 */
public interface Element {
    void accept(Visitor visitor);
}
