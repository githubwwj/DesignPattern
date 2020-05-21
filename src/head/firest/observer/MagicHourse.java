package head.firest.observer;

import java.util.ArrayList;

/**
 * �ɹ۲��� <==> ���� <==> ���� <==>ħ����
 */
public class MagicHourse implements Subject {

	// ��Ŷ�����
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	/**
	 * ��ע��۲��ߕr������ֻ������ӵ�ArrayList���ɡ�
	 */
	@Override
	public void registerObserver(Observer obj) {
		observers.add(obj);
	}

	/**
	 * ���۲���ȡ��ע�ᣬ���ǰ�����ArrayList��ɾ��
	 */
	@Override
	public void removeObserver(Observer obj) {
		int i = observers.indexOf(obj);
		if (i >= 0) {
			observers.remove(obj);
		}
	}

	/**
	 * �����������״̬����ÿһ���۲��ߣ���Ϊ�۲��߶�ʵ����update������ ��������֪�����֪ͨ����
	 */
	@Override
	public void notifyObserver(Object t) {
		for (Observer observer : observers) {
			observer.update(this, t);
		}
	}

	@Override
	public void notifyObserver() {
		notifyObserver(null);
	}

	// ħ����Ū��һ������
	public void publish(String news) {
		notifyObserver(news);
	}

}
