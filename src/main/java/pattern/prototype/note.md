# [原型模式](https://www.runoob.com/design-pattern/prototype-pattern.html )
 
释放本身数据库的内容到新实例，以便释放链接  
>一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

1、[为什么不用new直接新建对象，而要用原型模式？](https://blog.csdn.net/huangyimo/article/details/80390001  ) 
>首先，用new新建对象不能获取当前对象运行时的状态，其次就算new了新对象，在将当前对象的值复制给新对象，效率也不如原型模式高。