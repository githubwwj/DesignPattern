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
		System.out.println("���е�Ѽ�Ӷ�����Ӿ,������Ѽ!");
	}

	//���ǿ�����ʱ���������������ı�Ѽ�ӵ���Ϊ
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	

}
