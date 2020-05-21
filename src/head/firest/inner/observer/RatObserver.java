package head.firest.inner.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Jerry 观察者
 */
public class RatObserver implements Observer {

	// 观察者名字
	private String name;
	private Object mData;

	/**
	 * @param observeable 创建观察者时添加到魔法屋
	 * @param name 观察者的名字
	 */
	public RatObserver(Observable observeable, String name) {
		observeable.addObserver(this);
		this.name = name;
	}
	
	
	/**
	 * @param observeable 魔法屋
	 * @param data 魔法屋发送过来的数据  <==>  Jerry看到的宝贝
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MagicHourse) {
			this.mData = arg;
			System.out.println(name + mData);
		}
	}

}