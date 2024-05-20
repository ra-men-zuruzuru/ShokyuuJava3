public class RectLoop extends MyFrame {
	public void run() {
		setColor(0,128,0);
		int x=30;
		int y=0;
		for(int i=0;i<10;i++) {
			System.out.println(x);
			fillRect(x,y,10,100);
			x+=20;
			y+=30;
		}
	}

}

