package head.first.strategy;

/**
 * 我们建立一个火箭动力飞行的行为
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("火箭动力飞行");
	}

}
