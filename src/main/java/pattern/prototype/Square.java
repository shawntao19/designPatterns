package pattern.prototype;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:20
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
