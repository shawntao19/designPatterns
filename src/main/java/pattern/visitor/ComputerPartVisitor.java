package pattern.visitor;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:39
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
