package pattern.chain.optimization;


/**
 * @Author: xuwentao
 * Created on 2019/10/11 22:05
 */
public class ConsoleLogger extends AbstractLoggerOpt {

    public ConsoleLogger() {
        this.level = AbstractLoggerOpt.INFO;
        //指定nextLogger为FileLogger
        setNextLogger(new FileLogger());
    }

    @Override
    public void log(String message) {
        System.out.println("Console logger: " + message);
    }
}