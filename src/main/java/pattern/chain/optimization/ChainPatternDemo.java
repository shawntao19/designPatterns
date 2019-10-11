package pattern.chain.optimization;

import pattern.chain.org.AbstractLogger;

/**
 * @Author: xuwentao
 * Created on 2019/10/11 22:12
 */
public class ChainPatternDemo {
    public static void main(String[] args) {

        /**
         * 暴露最低等级既可
         */
        AbstractLoggerOpt consoleLogger = new ConsoleLogger();

        consoleLogger.logMegger(3, "错误信息");
        System.out.println();
        consoleLogger.logMegger(2, "测试信息");
        System.out.println();
        consoleLogger.logMegger(1, "控制台信息");
    }
}
