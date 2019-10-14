package pattern.visitor.other;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 10:00
 */
//具体元素A类
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
