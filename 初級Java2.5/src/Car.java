
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx ,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vx;
	}
	public void Draw(MyFrame frame) {
		frame.fillRect(x,y,90,40);
		frame.fillRect(x-30,y+40,140,30);
		frame.fillOval(x-15,y+60,30,30);
		frame.fillOval(x+50,y+60,30,30);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}

}
