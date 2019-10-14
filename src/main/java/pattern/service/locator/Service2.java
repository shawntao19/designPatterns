package pattern.service.locator;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:34
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }


    public String getName() {
        return "Service2";
    }
}
