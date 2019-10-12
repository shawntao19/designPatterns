package pattern.strategy.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:19
 */
public class OperationSubstract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
