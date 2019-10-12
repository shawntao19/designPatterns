package pattern.strategy.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:19
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
