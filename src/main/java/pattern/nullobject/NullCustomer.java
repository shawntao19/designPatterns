package pattern.nullobject;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:16
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
