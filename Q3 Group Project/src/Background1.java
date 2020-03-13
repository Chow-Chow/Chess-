import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Background1 {
	private int x, y;	
	private int Width;
	private int Height;
	private int vx;
	private Image board;
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	
	public Background1(String fileName,int x1, int y1){
		Width = 2000;
		Height = 2000;
		x = x1;
		y = y1;
		
		//do not touch
		board = getImage(fileName);
		updateBackground();
	}
	
	private void updateBackground() {
		tx.setToTranslation(x, y);
	}
	
	// draw the affinetransform
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(board, tx, null);
	}
	// converts image to make it drawable in paint
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Driver.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	public void move(){
		vx = -2;
		x += vx;
		if(x < -2600){
			x = 5200;
		}
		updateBackground();
	}
}

