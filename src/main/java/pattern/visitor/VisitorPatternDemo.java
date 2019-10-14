package pattern.visitor;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:46
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
