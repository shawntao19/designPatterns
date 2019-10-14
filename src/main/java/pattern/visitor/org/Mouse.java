package pattern.visitor.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:41
 */
public class Mouse implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
