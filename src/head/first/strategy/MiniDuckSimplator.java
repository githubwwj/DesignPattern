package head.first.strategy;

public class MiniDuckSimplator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		//������MallardDuck�̳�����performQuack()����,����ί��quackBehavior������
		mallard.perfomQuack();
		mallard.perfomFly();
		
		System.out.println("-----------------------------------");
		
		Duck model=new ModelDuck();
		model.perfomFly(); //���ô˷����ᱻί�и�flyBehavior����,Ҳ��ʱFlyNoWayʵ��,�ö�������ģ��Ѽ
		//�����������õ�
		model.perfomQuack();
		model.setFlyBehavior(new FlyRocketPowered()); //��ص��ü̳�����setter����,�ѻ������������Ϊ�趨��ģ��Ѽ�С�
		//�ۣ�ģ��ѼͻȻ�����˻������������Ϊ��
		
		model.perfomFly(); //����ɹ���,����ζ�ſ��Զ�̬�ı����ķ�����Ϊ���������Ϊ��ʵ�ְ�����Ѽ����,���޷����������ˡ�
	}

}
