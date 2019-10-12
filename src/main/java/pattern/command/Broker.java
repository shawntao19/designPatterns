package pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 9:40
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
