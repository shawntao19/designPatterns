package pattern.template;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 9:34
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
