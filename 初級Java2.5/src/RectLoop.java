public class RectLoop extends MyFrame {
	public void run() {
		setColor(0,128,0);
		int x=30;
		int y=10;
		for(int i=0;i<10;i++) {
			System.out.println(x);
			fillRect(x,50,10,y);
			x+=20;
			y+=30;
		}
	}

}

