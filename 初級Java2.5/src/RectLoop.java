public class RectLoop extends MyFrame {
	public void run() {
		setColor(0,0,0);
		int x=30;
		int color=0;
		for(int i=0;i<10;i++) {
			setColor(color,color,color);
			fillRect(x,50,10,100);
			x+=20;
			color+=25;
		}
	}

}

