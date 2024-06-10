
public class Truck extends Vehicle {
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
	
	public void Draw(MyFrame frame) {
		frame.fillRect(x,y,100,10);
		frame.fillRect(x+75,y-30,25,30);
		frame.fillOval(x+10,y+10,10,10);
		frame.fillOval(x+20,y+10,10,10);
		frame.fillOval(x+70,y+10,10,10);
	}

}
