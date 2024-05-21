
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		int x=30;
		int y=80;
		setColor(0,128,0);
		while(x<=170) {
			fillRect(x,y,10,100);
			x+=20;
			y+=30;
			sleep(1);
		}
	}

}
