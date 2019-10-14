package pattern.visitor.other;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:59
 */
//抽象访问者
public interface Visitor
{
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
