package head.firest.observer;


/**
 * 观察者
 */
public interface Observer {
	// 当被观察者状态改变时,更新通知
	
	public void update(Subject o, Object data);
}
