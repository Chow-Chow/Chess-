
public class Piece extends Color {
	
	private String name;
	boolean isWhite;
	boolean isSelected;
	int x;
	int y;

	
	public Piece(String name, boolean isWhite, boolean isSelected, int x, int y){
		this.name = name;
		this.isWhite = isWhite;
		this.isSelected = isSelected;
		this. x = x;
		this.y = y;
	}
	public Piece(String name, int x, int y){
		this.name = name; 
		this.x = x;
		this.y = y;
	}
	
	
	
	
	
	
	
	public String getName(){
		return name;
	}
	public Boolean getIsWhite(){
		return isWhite;
	}
	public boolean getIsSelected(){
		return isSelected;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setSelected(boolean a){
		isSelected = a;
	}
	
}
