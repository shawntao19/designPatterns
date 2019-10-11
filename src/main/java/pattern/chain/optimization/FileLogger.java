package pattern.chain.optimization;



/**
 * @Author: xuwentao
 * Created on 2019/10/11 21:07
 */
public class FileLogger extends AbstractLoggerOpt {

    public FileLogger() {
        this.level = AbstractLoggerOpt.DEBUG;
        //指定nextLogger为FileLogger
        setNextLogger(new ErrorLogger());
    }


    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }

}
