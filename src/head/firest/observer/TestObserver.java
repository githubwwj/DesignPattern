package head.firest.observer;

public class TestObserver {
	public static void main(String[] args) {
		// �������۲���
		MagicHourse magicHourse = new MagicHourse();

		// ����������ͬ�Ĺ۲���
		new TomObserver(magicHourse, "��ķ-Tom");
		
		new RatObserver(magicHourse, "����-Jerry");

		// ���¿ɹ۲��ߵ����ݣ����Զ�֪ͨ������ע��Ĺ۲���
		magicHourse.publish("��һ������");
	}
}
