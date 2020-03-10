
public class Piece extends Color {
	
	private String name;
	boolean isWhite;
	
	
	
	public Piece(String name, boolean isWhite){
		this.name = name;
		this.isWhite = isWhite;
	}
	
	public String getName(){
		return name;
	}
	public Boolean getisWhite(){
		return isWhite;
	}
	
}
