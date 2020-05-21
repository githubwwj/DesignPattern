package head.firest.observer;

import java.util.ArrayList;

/**
 * 可观察者 <==> 主题 <==> 报社 <==>魔法屋
 */
public class MagicHourse implements Subject {

	// 存放订阅者
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	/**
	 * 当注册观察者時，我们只需把它加到ArrayList即可。
	 */
	@Override
	public void registerObserver(Observer obj) {
		observers.add(obj);
	}

	/**
	 * 当观察者取消注册，我们把它从ArrayList中删除
	 */
	@Override
	public void removeObserver(Observer obj) {
		int i = observers.indexOf(obj);
		if (i >= 0) {
			observers.remove(obj);
		}
	}

	/**
	 * 我们在这里把状态告诉每一个观察者，因为观察者都实现了update（）， 所以我们知道如何通知它们
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

	// 魔法屋弄出一个宝贝
	public void publish(String news) {
		notifyObserver(news);
	}

}
