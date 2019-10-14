package pattern.compositeEntity;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 13:52
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
