package pattern.intercepting.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:21
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
