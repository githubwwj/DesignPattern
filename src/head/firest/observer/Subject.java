package head.firest.observer;

/**
 * <==> ��ͬ����
 * �ɹ۲��� <==> ���� <==> ���� <==>ħ����
 * ������۲����ṩ�κ����ݶ���
 */
public interface Subject {
    
     //��ӹ۲���
    void registerObserver(Observer obj);
    
    //�Ƴ��۲���
    void removeObserver(Observer obj);
    
    //������״̬�ı�ʱ,�������������,֪ͨ���еĹ۲���
    void notifyObserver(Object t);
    
    //������״̬�ı�ʱ,�������������,֪ͨ���еĹ۲���
    void notifyObserver();

}
