package pattern.intercepting.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:22
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
