
public class Board {
	
	private int screenWidth = 1000;
	private int screenHeight =  1000;
	private Piece[][] board = new Piece[8][8];
	
	// creates the board and fills it with the properly placed pieces
	public Board(Piece[][] c){
		this.board = fillBoard(c);
		}
	
	
	public Piece[][] fillBoard(Piece[][] mine){
		for(int i=0; i<board.length; i++){
				for(int j =0; j< board.length; j++){
					// fill white
					if((i == 0 && j ==0) ||(i==0 && j==7)){
						Piece a = new Piece("Rook", true, false, j, i);
						mine[i][j] = a;
					}
					if((i == 0 && j ==1) ||(i==0 && j==6)){
						Piece a = new Piece("Knight", true,false, j,i);
						mine[i][j] = a;
					}
					if((i == 0 && j ==2) ||(i==0 && j==5)){
						Piece a = new Piece("Bishop", true,false,j,i);
						mine[i][j] = a;
					}
					if((i == 0 && j ==3)){
						Piece a = new Piece("Queen", true,false,j,i);
						mine[i][j] = a;
					}
					if((i == 0 && j ==4)){
						Piece a = new Piece("King", true,false,j,i);
						mine[i][j] = a;
					}
					if(i == 1){
						Piece a = new Piece("Pawn", true,false,j,i);
						mine[i][j] = a;
					}
					
					// fill black
					
					if(i == 6){
						Piece a = new Piece("Pawn", false,false,j,i);
						mine[i][j] = a;
					}
					if((i == 7 && j ==0) ||(i==7 && j==7)){
						Piece a = new Piece("Rook", false,false,j,i);
						mine[i][j] = a;
					}
					if((i == 7 && j ==1) ||(i==7 && j==6)){
						Piece a = new Piece("Knight", false,false,j,i);
						mine[i][j] = a;
					}
					if((i == 7 && j ==2) ||(i==7 && j==5)){
						Piece a = new Piece("Bishop", false,false,j,i);
						mine[i][j] = a;
					}
					if((i == 7 && j ==3)){
						Piece a = new Piece("Queen", false,false,j,i);
						mine[i][j] = a;
					}
					if((i == 7 && j ==4)){
						Piece a = new Piece("King", false,false,j,i);
						mine[i][j] = a;
					}
					
					// empty spaces = 7th type of piece, null piece, no color
					if(i >1 && i<6){
						Piece a = new Piece("Null",j,i);
						mine[i][j] = a;
					}
					
				}
			}
		return mine;
	}
	
	
	
	public Piece getPiece(int x, int y){
		return board[y][x];
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
	public boolean getColor(Piece p){
		return p.getIsWhite();
	}
	public boolean getIsSelected(Piece p){
		return p.getIsSelected();
	}
	
public boolean legalMove(Piece  p, int x, int y){
		boolean legal = false;
		if(p.getName().equals("Knight") && p.getIsSelected() == true  
				&& (((
				   (p.getX()+1 == x || p.getX()-1 ==x) && p.getY()+2 == y) 
				|| (p.getX()+2 == x && (p.getY()+1 ==y || p.getY()-1 ==y)
				|| (p.getX()-2 ==x && (p.getY()+1 ==y || p.getY()-1 ==y)))
				|| ((p.getX()+1 ==x || p.getX()-1 ==x) && p.getY()-2 ==y)))
				&& getColor(getPiece(x,y)) != getColor(p) 
				&& x >= 0 && x < 8 && y >= 0 && y < 8){
				legal = true;
		}
		//if(p.getName().equals)
		return legal;
	}
	
	
	
	
	
	
	// not useless, will find location of the first piece that matches the description
	public int getY(Piece p){
		return p.getY();
		
	}
	// not useless, will find location of the first piece that matches the description
	public int getX(Piece p){
		return p.getX();
	}
	
}
