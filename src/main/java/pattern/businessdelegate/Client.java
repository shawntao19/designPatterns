package pattern.businessdelegate;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 11:24
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
