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



public class Board extends JFrame{
	
	private int screenWidth = 1000;
	private int screenHeight =  800;
	private Piece[][] board = new Piece[8][8];
	//private Image Board;
	//private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	
	public static void main(String[] arg){
		Board b = new Board();
		b.setVisible(true);
	}
	
	
	// creates the board and fills it with the properly placed pieces
	public Board(/*Piece[][] c*/){
		setTitle("Chess");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("chessboard.jpg")));
		this.board = fillBoard();
		this.setSize(1000,1000);
		getContentPane().setLayout(new GridLayout(9, 8, 0, 0));
	
		//creating Toggle buttons for chess pieces
		JToggleButton tglbtnNewToggleButton = new JToggleButton();
		tglbtnNewToggleButton.setBackground(Color.WHITE);
		tglbtnNewToggleButton.setIcon(new ImageIcon(Board.class.getResource("blackrook.png")));
		getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton();
		tglbtnNewToggleButton_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(Board.class.getResource("blackknight.png")));
		getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton();
		tglbtnNewToggleButton_2.setBackground(Color.WHITE);
		tglbtnNewToggleButton_2.setIcon(new ImageIcon(Board.class.getResource("blackbishop.png")));
		getContentPane().add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton();
		tglbtnNewToggleButton_4.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_4.setIcon(new ImageIcon(Board.class.getResource("blackking.png")));
		getContentPane().add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton();
		tglbtnNewToggleButton_3.setBackground(Color.WHITE);
		tglbtnNewToggleButton_3.setIcon(new ImageIcon(Board.class.getResource("blackqueen.png")));
		getContentPane().add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton();
		tglbtnNewToggleButton_5.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_5.setIcon(new ImageIcon(Board.class.getResource("blackbishop.png")));
		getContentPane().add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton();
		tglbtnNewToggleButton_6.setBackground(Color.WHITE);
		tglbtnNewToggleButton_6.setIcon(new ImageIcon(Board.class.getResource("blackknight.png")));
		getContentPane().add(tglbtnNewToggleButton_6);
	
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton();
		tglbtnNewToggleButton_7.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_7.setIcon(new ImageIcon(Board.class.getResource("blackrook.png")));
		getContentPane().add(tglbtnNewToggleButton_7);
		
		
		
			
		//integrate this into Piece[][]
		//Insets buttonMargin = new Insets(0,0,0,0);
		//for(int i=0; i<board.length;i++){
		//	for(int j=0; j<board[0].length;j++){
		//		JButton b = new JButton();
		//		ImageIcon icon = new ImageIcon(
          //              new BufferedImage(64, 64, 0?));
		//		b.setIcon(icon);
		//	}
	//	}
		
		
		for(int i = 0; i < 64; i++){
			Piece button = new Piece();
			getContentPane().add(button);
		}
		
	}
	
	
	
	public Piece[][] fillBoard(){
		Piece[][] mine = board;
		for(int i=0; (i >= 0 && i <=1) || (i<=7 && i >=6); i++){
				for(int j =0; j< board.length; j++){
					// fill white
					if((i == 0 && j ==0) ||(i==0 && j==7)){
						Piece a = new Piece("Rook", true);
						mine[i][j] = a;
					}
					if((i == 0 && j ==1) ||(i==0 && j==6)){
						Piece a = new Piece("Knight", true);
						mine[i][j] = a;
					}
					if((i == 0 && j ==2) ||(i==0 && j==5)){
						Piece a = new Piece("Bishop", true);
						mine[i][j] = a;
					}
					if((i == 0 && j ==3)){
						Piece a = new Piece("Queen", true);
						mine[i][j] = a;
					}
					if((i == 0 && j ==4)){
						Piece a = new Piece("King", true);
						mine[i][j] = a;
					}
					if(i == 1){
						Piece a = new Piece("Pawn", true);
						mine[i][j] = a;
					}
					
					// fill black
					
					if(i == 6){
						Piece a = new Piece("Pawn", false);
						mine[i][j] = a;
					}
					if((i == 7 && j ==0) ||(i==7 && j==7)){
						Piece a = new Piece("Rook", false);
						mine[i][j] = a;
					}
					if((i == 7 && j ==1) ||(i==7 && j==6)){
						Piece a = new Piece("Knight", false);
						mine[i][j] = a;
					}
					if((i == 7 && j ==2) ||(i==7 && j==5)){
						Piece a = new Piece("Bishop", false);
						mine[i][j] = a;
					}
					if((i == 7 && j ==3)){
						Piece a = new Piece("Queen", false);
						mine[i][j] = a;
					}
					if((i == 7 && j ==4)){
						Piece a = new Piece("King", false);
						mine[i][j] = a;
					}
					
				}
			}
		return mine;
	}
	
	
	public Piece getPiece(int x, int y){
		return board[x][y];
	}
	
	public int getScreenWidth(){
		return screenWidth;
	}
	public int getScreenHeight(){
		return screenHeight;
	}
	
	public String getPieceName(Piece p){
		return p.getName();
	}
	
	
}




