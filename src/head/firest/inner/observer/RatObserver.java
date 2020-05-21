package head.firest.inner.observer;

import java.util.Observable;
import java.util.Observer;

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
	public RatObserver(Observable observeable, String name) {
		observeable.addObserver(this);
		this.name = name;
	}
	
	
	/**
	 * @param observeable ħ����
	 * @param data ħ���ݷ��͹���������  <==>  Jerry�����ı���
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MagicHourse) {
			this.mData = arg;
			System.out.println(name + mData);
		}
	}

}