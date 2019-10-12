package pattern.command;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 9:40
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
