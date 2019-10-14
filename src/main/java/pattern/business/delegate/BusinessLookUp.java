package pattern.business.delegate;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 11:24
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
