package algorithm.blockchain.example1;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuwentao
 * Created on 2021/11/24 17:07
 */
public class CalculateStart {
    public static void main(String[] args) {
        //创建一个空的区块链
        List<Block> blockchain = new ArrayList<Block>();
        //生成创世区块
        Block block = new Block(1, System.currentTimeMillis(), new ArrayList<Transaction>(), 1, "1", "1");
        //加入创世区块到区块链里
        blockchain.add(block);
        System.out.println(JSON.toJSONString(blockchain));

        // 发送方钱包地址
        String sender = "sender_wallet";
        //接收方钱包地址
        String recipient = "recipient_wallet";

        //创建一个空的交易集合
        List<Transaction> txs = new ArrayList<Transaction>();
        //挖矿
        mineBlock(blockchain, txs, sender);
        System.out.println(sender + "钱包的余额为：" + getWalletBalance(blockchain, sender));

        //创建一个空的交易集合
        List<Transaction> txs1 = new ArrayList<Transaction>();
        //已发生但未记账的交易记录，发送者给接收者转账3个比特币
        Transaction tx1 = new Transaction(SecureUtil.simpleUUID(), sender, recipient, 3);
        //已发生但未记账的交易记录，发送者给接收者转账1个比特币
        Transaction tx2 = new Transaction(SecureUtil.simpleUUID(), sender, recipient, 1);
        txs1.add(tx1);
        txs1.add(tx2);
        //挖矿
        mineBlock(blockchain, txs1, sender);
        System.out.println(sender + "钱包的余额为：" + getWalletBalance(blockchain, sender));
        System.out.println(recipient + "钱包的余额为：" + getWalletBalance(blockchain, recipient));
    }

    /**
     * 挖矿
     *
     * @param blockchain 整个区块链
     * @param txs        需记账交易记录
     * @param address    矿工钱包地址
     * @return
     */
    private static void mineBlock(List<Block> blockchain, List<Transaction> txs, String address) {    //加入系统奖励的交易，默认挖矿奖励10个比特币
        Transaction sysTx = new Transaction(SecureUtil.simpleUUID(), "", address, 10);
        txs.add(sysTx);    //获取当前区块链里的最后一个区块
        Block latestBlock = blockchain.get(blockchain.size() - 1);    //随机数
        int nonce = 1;
        String hash = "";
        while (true) {
            hash = SecureUtil.sha256(latestBlock.getHash() + JSON.toJSONString(txs) + nonce);
            if (hash.startsWith("0000")) {
                System.out.println("=====计算结果正确，计算次数为：" + nonce + ",hash:" + hash);
                break;
            }
            nonce++;
//            System.out.println("计算错误，hash:" + hash);
        }
        //解出难题，可以构造新区块并加入进区块链里
        Block newBlock = new Block(latestBlock.getIndex() + 1, System.currentTimeMillis(), txs, nonce, latestBlock.getHash(), hash);
        blockchain.add(newBlock);
        System.out.println("挖矿后的区块链：" + JSON.toJSONString(blockchain));
    }


    /**
     * 查询余额
     *
     * @param blockchain
     * @param address
     * @return
     */
    public static int getWalletBalance(List<Block> blockchain, String address) {
        int balance = 0;
        for (Block block : blockchain) {
            List<Transaction> transactions = block.getTransactions();
            for (Transaction transaction : transactions) {
                if (address.equals(transaction.getRecipient())) {
                    balance += transaction.getAmount();
                }
                if (address.equals(transaction.getSender())) {
                    balance -= transaction.getAmount();
                }
            }
        }
        return balance;
    }
}
