
public class Face {
	int x,y;
	public void Draw(MyFrame frame) {
		frame.fillOval(x,y,50,100);
		frame.fillOval(x+100,y,50,100);
		frame.fillOval(x,y+160,150,10);
	}

}
