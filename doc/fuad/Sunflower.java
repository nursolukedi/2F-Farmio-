package doc.fuad;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Sunflower extends GameObject implements Food{
	private Image image= new ImageIcon("src/image/sunflower.png").getImage();
	
	private final int healthPoints=25;
	private final int storePrice=5;
	private final String name="sunflower";
	
	public Sunflower(int x, int y){
		super(x, y);
	}
	
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public String getName(){
		return name;
	}
	
	public int getStoreSellingPrice(){
		return storePrice;
	}
	
	public Image getImage(){
		return image;
	}
	
}
