
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		int x=30;
		setColor(0,128,0);
		while(x<=170) {
			fillRect(x,80,10,100);
			x+=20;
			sleep(1);
		}
	}

}
