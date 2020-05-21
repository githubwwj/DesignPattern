package head.first.strategy;

public class MiniDuckSimplator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		//这会调用MallardDuck继承来的performQuack()方法,进而委托quackBehavior对象处理。
		mallard.perfomQuack();
		mallard.perfomFly();
		
		System.out.println("-----------------------------------");
		
		Duck model=new ModelDuck();
		model.perfomFly(); //调用此方法会被委托给flyBehavior对象,也就时FlyNoWay实例,该对象是在模型鸭
		//构造器中设置的
		model.perfomQuack();
		model.setFlyBehavior(new FlyRocketPowered()); //这回调用继承来的setter方法,把火箭动力飞行行为设定到模型鸭中。
		//哇！模型鸭突然具有了火箭动力飞行行为！
		
		model.perfomFly(); //如果成功了,就意味着可以动态改变它的飞行行为。如果把行为的实现绑死在鸭子中,就无法做到这样了。
	}

}
