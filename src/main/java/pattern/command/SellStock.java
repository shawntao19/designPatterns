package pattern.command;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 9:40
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
