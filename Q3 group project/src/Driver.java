import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
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

	Board b = new Board(mine);
	
	public void Paint(Graphics g){
		
	}
	
	
	public void Update(){
		
	}
	
	
	public Driver(){
	JFrame f = new JFrame();
	f.setSize(b.getScreenWidth(), b.getScreenHeight());
	f.setBackground(Color.BLACK);
	f.setResizable(false);
	f.setVisible(true);
	System.out.println(b.getPieceName(b.getPiece(1,0)) + " " + b.getColor(b.getPiece(1, 0))); // knight, true
	System.out.println(b.getPieceName(b.getPiece(1,7)) + " " + b.getColor(b.getPiece(1, 7))); // knight, false
	System.out.println(b.getPieceName(b.getPiece(0,4)) + " " + b.getColor(b.getPiece(0, 4))); // king, true
	System.out.println(b.getPieceName(b.getPiece(4,6)) + " " + b.getColor(b.getPiece(4, 6))); // error
	System.out.println(b.getPieceName(b.getPiece(7,5)) + " " + b.getColor(b.getPiece(7, 5))); // bishop, false
	System.out.println(b.getIsSelected(b.getPiece(1, 5)));
	System.out.println(b.getIsSelected(b.getPiece(6, 5)));
	//System.out.println(b.getX(b.getPiece(1,6)));
	//System.out.println(b.getY(b.getPiece(1,6)));
	b.getPiece(1,7).setSelected(true);
	b.getPiece(6, 0).setSelected(true);
	System.out.println(b.legalMove(b.getPiece(6, 0), 7, 2));
	System.out.println(b.legalMove(b.getPiece(1,7), 0, 5));
	}
	
	public static void main(String[] arg){
		Driver d = new Driver();
	
	}
	
	
}
