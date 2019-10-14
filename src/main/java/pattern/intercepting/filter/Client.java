package pattern.intercepting.filter;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:23
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
