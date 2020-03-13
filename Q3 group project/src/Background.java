import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.Color;



public class Background extends JFrame{
	
	private int screenWidth = 1000;
	private int screenHeight =  800;
	private Piece[][] board = new Piece[8][8];
	//private Image Board;
	//private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	
	public static void main(String[] arg){
		Background b = new Background();
		b.setVisible(true);
	}
	
	
	// creates the board and fills it with the properly placed pieces
	public Background(/*Piece[][] c*/){
		setTitle("Chess");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Background.class.getResource("chessboard.jpg")));
		//this.board = fillBoard();
		this.setSize(1000,1000);
		getContentPane().setLayout(new GridLayout(9, 8, 0, 0));
	
		//creating Toggle buttons for chess pieces
		JToggleButton tglbtnNewToggleButton = new JToggleButton();
		tglbtnNewToggleButton.setBackground(Color.WHITE);
		tglbtnNewToggleButton.setIcon(new ImageIcon(Background.class.getResource("blackrook.png")));
		getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton();
		tglbtnNewToggleButton_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(Background.class.getResource("blackknight.png")));
		getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton();
		tglbtnNewToggleButton_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_2.setIcon(new ImageIcon(Background.class.getResource("blackbishop.png")));
		getContentPane().add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton();
		tglbtnNewToggleButton_4.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_4.setIcon(new ImageIcon(Background.class.getResource("blackking.png")));
		getContentPane().add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton();
		tglbtnNewToggleButton_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_3.setIcon(new ImageIcon(Background.class.getResource("blackqueen.png")));
		getContentPane().add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton();
		tglbtnNewToggleButton_5.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_5.setIcon(new ImageIcon(Background.class.getResource("blackbishop.png")));
		getContentPane().add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton();
		tglbtnNewToggleButton_6.setBackground(Color.WHITE);
		tglbtnNewToggleButton_6.setIcon(new ImageIcon(Background.class.getResource("blackknight.png")));
		getContentPane().add(tglbtnNewToggleButton_6);
	
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton();
		tglbtnNewToggleButton_7.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_7.setIcon(new ImageIcon(Background.class.getResource("blackrook.png")));
		getContentPane().add(tglbtnNewToggleButton_7);
		
		
		for(int i = 0; i < 64; i++){
			Button button = new Button();
			getContentPane().add(button);
		}
		
	}
	
	
	
}