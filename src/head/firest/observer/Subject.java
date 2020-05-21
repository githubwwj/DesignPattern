package head.firest.observer;

/**
 * <==> 等同与标记
 * 可观察者 <==> 主题 <==> 报社 <==>魔法屋
 * 报社向观察者提供任何数据对象
 */
public interface Subject {
    
     //添加观察者
    void registerObserver(Observer obj);
    
    //移除观察者
    void removeObserver(Observer obj);
    
    //当主题状态改变时,这个方法被调用,通知所有的观察者
    void notifyObserver(Object t);
    
    //当主题状态改变时,这个方法被调用,通知所有的观察者
    void notifyObserver();

}
