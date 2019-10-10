package pattern.prototype;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:20
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
