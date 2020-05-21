package head.firest.observer;

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
	public RatObserver(Subject observeable, String name) {
		observeable.registerObserver(this);
		this.name = name;
	}
	
	/**
	 * @param observeable 魔法屋
	 * @param data 魔法屋发送过来的数据  <==>  Jerry看到的宝贝
	 */
	@Override
	public void update(Subject observable, Object data) {
		this.mData = data;
		System.out.println(name + mData);
	}

}