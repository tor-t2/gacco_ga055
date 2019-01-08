import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class MainFrame extends Frame
	implements WindowListener, ActionListener, MouseListener, MouseMotionListener {
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
	private Point p1=null;
	private Figure currentFigure = null;
	private Color colors[] = {Color.RED, Color.GREEN, Color.BLUE, Color.BLACK};
	private ArrayList<Figure> figures = new ArrayList<Figure>();
	private MenuItem save;
	private MenuItem exit;
	private MenuItem load;

	/* コンストラクタ */
	MainFrame(){
		panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel, "North");
		checkBoxGroup = new CheckboxGroup();
		checkbox[0]=new Checkbox("円", checkBoxGroup, true);
		checkbox[1]=new Checkbox("四角形", checkBoxGroup, false);
		for(int i=0;i<checkbox.length;i++) {
			panel.add(checkbox[i]);
		}
		String[] labelTexts= {"線の色","塗りつぶしの色"};
		String[] colorNames= {"赤","緑","青","黒"};
		for(int i=0; i<labelTexts.length;i++) {
			panel.add(new Label(labelTexts[i]));
			choice[i] = new Choice();
			panel.add(choice[i]);
			for(int j=0;j<colorNames.length;j++) {
				choice[i].addItem(colorNames[j]);
			}
		}
		deleteButton = new Button("削除");
		deleteButton.addActionListener(this);
		panel.add(deleteButton);
		addWindowListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		/* メニューの追加 */
		MenuBar menu = new MenuBar();
		setMenuBar(menu);
		Menu fileMenu = menu.add(new Menu("ファイル"));
		save = fileMenu.add(new MenuItem("保存"));
		load = fileMenu.add(new MenuItem("読み込み"));
		fileMenu.addSeparator();
		exit = fileMenu.add(new MenuItem("終了"));
		save.addActionListener(this);
		load.addActionListener(this);
		exit.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		for(Iterator<Figure> it = figures.iterator(); it.hasNext();) {
			Figure fig = it.next();
			fig.draw(g);
		}
		if(this.currentFigure != null) {
			this.currentFigure.draw(g);
		}
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
			if(this.figures.isEmpty() == false) {
				this.figures.remove(this.figures.size()-1);
				repaint();
			}
		}else if(e.getSource() == save) {
			FileDialog fileDialog = new FileDialog(this,"ファイルを保存する",FileDialog.SAVE);
			fileDialog.setDirectory(".");
			fileDialog.setFile("draw.csv");
			fileDialog.setVisible(true);
			if(fileDialog.getFile() != null) {
				File file = new File(fileDialog.getDirectory(), fileDialog.getFile());
				PrintWriter printWriter = null;
				try {
					printWriter = new PrintWriter(file);
					for(Figure f : this.figures) {
						printWriter.println(f.toCSV());
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					if(printWriter != null) {
						printWriter.close();
					}
				}
			}
		}else if(e.getSource() == load) {
			//System.out.println("読み込みメニュー実行");
			FileDialog fileDialog = new FileDialog(this, "ファイルを読み込む", FileDialog.LOAD);
			fileDialog.setDirectory(".");
			fileDialog.setVisible(true);
			if(fileDialog.getFile() != null) {
				File file = new File(fileDialog.getDirectory(), fileDialog.getFile());
			}
		}else if(e.getSource() == exit) {
			this.dispose();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		p1 = e.getPoint();
		Color lineColor = colors[choice[0].getSelectedIndex()];
		Color fillColor = colors[choice[1].getSelectedIndex()];
		if(checkbox[0].getState()) {
			this.currentFigure = new Oval();
		}else if(checkbox[1].getState()) {
			this.currentFigure = new Rect();
		}
		this.currentFigure.setColors(lineColor, fillColor);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(this.currentFigure != null) {
			Point p2 = e.getPoint();
			if(this.p1.x != p2.x && this.p1.y != p2.y) {
				this.currentFigure.setFromPoints(p1, p2);
				this.currentFigure.draw(this.getGraphics());
				this.figures.add(currentFigure);
				this.repaint();
			}
			this.currentFigure = null;
			p1 = null;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p2 = e.getPoint();
		if(this.currentFigure != null) {
			this.currentFigure.setFromPoints(p1, p2);
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("マウス移動 ("+e.getPoint().getX()+","+e.getPoint().getY()+")");

	}

}
