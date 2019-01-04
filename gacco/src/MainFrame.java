import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainFrame extends Frame implements WindowListener, ActionListener {
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setSize(640, 480);
		frame.setTitle("図形描画ツール");
		frame.setLocation(300, 200);
		frame.setVisible(true);
	}
	private Panel panel;
	private Button deleteButton;
	private String[] labels= {"線の色","塗りつぶしの色"};
	/* コンストラクタ */
	MainFrame(){
		panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel, "North");
		for(int i=0; i<labels.length;i++) {
			Label label = new Label(labels[i]);
			panel.add(label);
		}
		deleteButton = new Button("削除");
		deleteButton.addActionListener(this);
		panel.add(deleteButton);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose(); // ウィンドウを閉じる

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == deleteButton) {
			System.out.println("削除ボタンが押されました。");
		}
	}

}
