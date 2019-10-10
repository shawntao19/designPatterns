https://www.runoob.com/design-pattern/prototype-pattern.html  
原型模式  
释放本身数据库的内容到新实例，以便释放链接  
一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。