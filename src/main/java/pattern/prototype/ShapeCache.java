package pattern.prototype;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 11:21
 */
import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    /**
     * 该方法，相比下面 可以释放数据库链接，增强性能
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

//    public static Shape getShape(String shapeId) {
//        Shape cachedShape = shapeMap.get(shapeId);
//        return cachedShape;
//    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
