import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Driver extends JPanel{
	private Piece[][] mine = new Piece[8][8];

	//Board b = new Board(mine);
	
	//System.out.println(b.getPieceName(b.getPiece(1,5)));
	
	public Driver(){
	JFrame f = new JFrame();
	//f.setSize(b.getScreenWidth(), b.getScreenHeight());
	f.setBackground(Color.BLACK);
	f.setResizable(false);
	f.setVisible(true);
	
	Background1 b = new Background1("chessboard.jpg", 0, 0);
		
	}
	
	public void paint(Graphics g) {
	//	b.paint(g);
	}
	
	public static void main(String[] arg){
		Driver d = new Driver();
	
	}
	
}


