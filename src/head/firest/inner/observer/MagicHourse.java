package head.firest.inner.observer;

import java.util.Observable;

/**
 * �ɹ۲��� <==> ���� <==> ���� <==>ħ����
 */
public class MagicHourse extends Observable {
	
	//���ǲ���Ҫ��ס�۲����Ƕ��������ݽṹ

	// ħ����Ū��һ������
	public void publish(String news) {
		setChanged();
		notifyObservers(news);
	}

}
