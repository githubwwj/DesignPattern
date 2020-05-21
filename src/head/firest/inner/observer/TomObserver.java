package head.firest.inner.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Tom �۲���
 */
public class TomObserver implements Observer {

	// �۲�������
	private String name;
	private Object mData;
	private Observable observeable;

	/**
	 * @param observeable �����۲���ʱ��ӵ�ħ����
	 * @param name �۲��ߵ�����
	 */
	public TomObserver(Observable observeable, String name) {
		this.observeable=observeable;
		observeable.addObserver(this);
		this.name = name;
	}
	
	
	/**
	 * @param observeable ħ����
	 * @param data ħ���ݷ��͹���������  <==>  Tom�����ı���
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MagicHourse) { //��ȷ���ɹ۲�������MagicHourse��
			this.mData = arg;
			System.out.println(name + mData);
		}
	}

}