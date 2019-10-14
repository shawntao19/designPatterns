package pattern.intercepting.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:18
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
