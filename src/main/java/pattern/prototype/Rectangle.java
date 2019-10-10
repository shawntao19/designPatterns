package pattern.prototype;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:19
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
