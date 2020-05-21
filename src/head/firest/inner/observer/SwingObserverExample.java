package head.firest.inner.observer;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ������С����
 *
 */
public class SwingObserverExample {

	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}

	public void go() {
		JFrame frame = new JFrame();

		//���ô��ڴ�С
		frame.setBounds(0, 0, 300, 250);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int x = (int) (toolkit.getScreenSize().getWidth() - frame.getWidth()) / 2;
		int y = (int) (toolkit.getScreenSize().getHeight() - frame.getHeight()) / 2;
		//���ô��ھ�����ʾ
		frame.setLocation(x, y);

		//�������������ʹ��ħ���������¼�
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AagelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// ��ʾ����
		frame.setVisible(true);
	}

	class AagelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it,you might regret it!");
		}
	}

	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on,do it!");
		}
	}

}
