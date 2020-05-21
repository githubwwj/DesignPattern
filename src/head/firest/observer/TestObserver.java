package head.firest.observer;

public class TestObserver {
	public static void main(String[] args) {
		// 创建被观察者
		MagicHourse magicHourse = new MagicHourse();

		// 创建两个不同的观察者
		new TomObserver(magicHourse, "汤姆-Tom");
		
		new RatObserver(magicHourse, "杰瑞-Jerry");

		// 更新可观察者的数据，会自动通知所有已注册的观察者
		magicHourse.publish("有一个鸡腿");
	}
}
