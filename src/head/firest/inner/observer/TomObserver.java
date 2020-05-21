package head.firest.inner.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Tom 观察者
 */
public class TomObserver implements Observer {

	// 观察者名字
	private String name;
	private Object mData;
	private Observable observeable;

	/**
	 * @param observeable 创建观察者时添加到魔法屋
	 * @param name 观察者的名字
	 */
	public TomObserver(Observable observeable, String name) {
		this.observeable=observeable;
		observeable.addObserver(this);
		this.name = name;
	}
	
	
	/**
	 * @param observeable 魔法屋
	 * @param data 魔法屋发送过来的数据  <==>  Tom看到的宝贝
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MagicHourse) { //先确定可观察者属于MagicHourse类
			this.mData = arg;
			System.out.println(name + mData);
		}
	}

}