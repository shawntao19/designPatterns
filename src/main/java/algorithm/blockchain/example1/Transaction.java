package algorithm.blockchain.example1; /**
 * @Author: xuwentao
 * Created on 2021/11/24 16:51
 */

import lombok.Data;

/**
 * 交易
 *
 * @author aaron
 */
@Data
public class Transaction {
    /**
     * 交易唯一标识
     */
    private String id;
    /**
     * 交易发送方钱包地址
     */
    private String sender;
    /**
     * 交易接收方钱包地址
     */
    private String recipient;
    /**
     * 交易金额
     */
    private int amount;

    public Transaction() {
        super();
    }

    public Transaction(String id, String sender, String recipient, int amount) {
        super();
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }
}