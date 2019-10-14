package pattern.visitor;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:38
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
