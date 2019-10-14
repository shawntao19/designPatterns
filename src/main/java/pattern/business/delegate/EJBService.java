package pattern.business.delegate;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 11:23
 */
public class EJBService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
