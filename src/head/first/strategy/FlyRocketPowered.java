package head.first.strategy;

/**
 * ���ǽ���һ������������е���Ϊ
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("�����������");
	}

}
