package head.first.strategy;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck() {
	}
	
	public void perfomQuack() {
		quackBehavior.quack();
	}
	
	public void perfomFly() {
		flyBehavior.fly();
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("所有的鸭子都会游泳,包括假鸭!");
	}

	//我们可以随时调用这两个方法改变鸭子的行为
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	

}
