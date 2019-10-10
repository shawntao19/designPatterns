package pattern.proxy.dynamic.simple;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 16:32
 */
public class Teacher implements People {

    public String work() {
        System.out.println("老师教书育人...");
        return "教书";
    }

}
