# [装饰器模式](https://www.runoob.com/design-pattern/decorator-pattern.html)

和桥接模式有类似的部分


### [代理模式，装饰器模式，桥接模式的区别](https://blog.csdn.net/codeeeLearner/article/details/80372575)
与装饰器的区别在于装饰器是对 对象行为的扩展，对需求变化的适应，桥接是对 对象属性不同维度的抽象分离，对属性变化的适应。

e.g.装饰：牛奶可以加糖，加咖啡，等等；
~~~
CandyMilk(Milk)
~~~
桥接：饮料（牛奶，），添加剂（配方：糖：90%，辣椒：10%）
~~~
Milk.setAddition(new Addition(...));
~~~


