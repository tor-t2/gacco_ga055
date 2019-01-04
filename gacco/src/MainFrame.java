import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
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
	private CheckboxGroup checkBoxGroup;
	private Checkbox[] checkbox = new Checkbox[2];
	private Choice[] choice = new Choice[2];
	/* コンストラクタ */
	MainFrame(){
		panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel, "North");
		checkBoxGroup = new CheckboxGroup();
		checkbox[0]=new Checkbox("円", checkBoxGroup, true);
		checkbox[1]=new Checkbox("四角形", checkBoxGroup, false);
		String[] labelTexts= {"線の色","塗りつぶしの色"};
		for(int i=0;i<checkbox.length;i++) {
			panel.add(checkbox[i]);
		}
		for(int i=0; i<labelTexts.length;i++) {
			panel.add(new Label(labelTexts[i]));
			choice[i] = new Choice();
			panel.add(choice[i]);
			choice[i].addItem("赤");
			choice[i].addItem("緑");
			choice[i].addItem("青");
			choice[i].addItem("黒");
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
