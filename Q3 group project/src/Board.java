
public class Board {
	
	private int screenWidth = 1000;
	private int screenHeight =  800;
	private Piece[][] board = new Piece[8][8];
	
	// creates the board and fills it with the properly placed pieces
	public Board(Piece[][] c){
		this.board = fillBoard(c);
		}
	
	
	public Piece[][] fillBoard(Piece[][] mine){
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
