package pattern.business.delegate;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 11:24
 */
public class JMSService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
