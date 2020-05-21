package head.firest.inner.observer;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 倾听者小例子
 *
 */
public class SwingObserverExample {

	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}

	public void go() {
		JFrame frame = new JFrame();

		//设置窗口大小
		frame.setBounds(0, 0, 300, 250);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int x = (int) (toolkit.getScreenSize().getWidth() - frame.getWidth()) / 2;
		int y = (int) (toolkit.getScreenSize().getHeight() - frame.getHeight()) / 2;
		//设置窗口剧中显示
		frame.setLocation(x, y);

		//创建按，添加天使和魔鬼点击监听事件
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AagelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// 显示窗口
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
