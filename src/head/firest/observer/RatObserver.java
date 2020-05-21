package head.firest.observer;

/**
 * Jerry �۲���
 */
public class RatObserver implements Observer {

	// �۲�������
	private String name;
	private Object mData;

	/**
	 * @param observeable �����۲���ʱ��ӵ�ħ����
	 * @param name �۲��ߵ�����
	 */
	public RatObserver(Subject observeable, String name) {
		observeable.registerObserver(this);
		this.name = name;
	}
	
	/**
	 * @param observeable ħ����
	 * @param data ħ���ݷ��͹���������  <==>  Jerry�����ı���
	 */
	@Override
	public void update(Subject observable, Object data) {
		this.mData = data;
		System.out.println(name + mData);
	}

}