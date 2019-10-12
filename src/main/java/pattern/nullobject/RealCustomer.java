package pattern.nullobject;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:15
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
