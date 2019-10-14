package pattern.visitor;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:40
 */
public class Monitor implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
