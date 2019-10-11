package pattern.chain.optimization;

/**
 * @Author: xuwentao
 * Created on 2019/10/11 22:02
 */
public class ErrorLogger extends AbstractLoggerOpt {
    public ErrorLogger() {
        this.level = AbstractLoggerOpt.ERROR;
        //nextLogger设置为null
        //扩展时将此更改为新的Logger
        setNextLogger(null);
    }

    @Override
    public void log(String message) {
        System.out.println("Error logger: " + message);
    }
}