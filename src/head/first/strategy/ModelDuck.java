package head.first.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		//一开始，我们的模型鸭是不会飞的
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("我是一只模型鸭子");
	}

}
