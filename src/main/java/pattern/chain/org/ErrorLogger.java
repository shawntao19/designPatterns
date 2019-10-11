package pattern.chain.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/11 21:06
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}