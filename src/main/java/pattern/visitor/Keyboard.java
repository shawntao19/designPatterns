package pattern.visitor;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:39
 */
public class Keyboard implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}