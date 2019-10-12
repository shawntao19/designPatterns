package pattern.mediator.org;

import java.util.Date;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 10:49
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
