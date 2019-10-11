package pattern.chain;

/**
 * @Author: xuwentao
 * Created on 2019/10/11 21:06
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
