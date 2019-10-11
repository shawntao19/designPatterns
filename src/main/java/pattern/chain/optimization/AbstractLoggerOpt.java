package pattern.chain.optimization;

/**
 * @Author: xuwentao
 * Created on 2019/10/11 21:05
 */
public abstract class AbstractLoggerOpt {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLoggerOpt nextLogger;

    public void setNextLogger(AbstractLoggerOpt nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMegger(int level, String message) {
        if (this.level <= level) {
            log(message);
        }
        if (nextLogger != null) {
            nextLogger.logMegger(level, message);
        }
    }

    abstract protected void log(String message);

}