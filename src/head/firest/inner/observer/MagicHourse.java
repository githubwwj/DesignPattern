package head.firest.inner.observer;

import java.util.Observable;

/**
 * 可观察者 <==> 主题 <==> 报社 <==>魔法屋
 */
public class MagicHourse extends Observable {
	
	//我们不需要记住观察者们而建立数据结构

	// 魔法屋弄出一个宝贝
	public void publish(String news) {
		setChanged();
		notifyObservers(news);
	}

}
