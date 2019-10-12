### [策略模式 VS 状态模式](https://www.runoob.com/w3cnote/state-vs-strategy.html)

可以发现，这种设计下，糖果机根本不需要清楚状态的改变，它只用调用状态的方法就行。状态的改变是在状态内部发生的。这就是“状态模式”。

如果此时再增加一种状态，糖果机不需要做任何改变，我们只需要再增加一个状态类，然后在相关的状态类方法里面增加转换的过程即可。

PS:  
NoPatternGumballMachine  
投币操作都要查询先前状态

GumballMachine
内置状态后不查询直接操作