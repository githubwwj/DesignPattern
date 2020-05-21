package head.first.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		//һ��ʼ�����ǵ�ģ��Ѽ�ǲ���ɵ�
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("����һֻģ��Ѽ��");
	}

}
