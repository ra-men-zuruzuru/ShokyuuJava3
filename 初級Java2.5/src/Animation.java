
public class Animation extends MyFrame{
	public void run() {
		int x=30;
		setColor(0,128,0);
		while(x<=170) {
			clear();
			fillOval(x,80,100,100);
			x+=5;
			sleep(0.1);
		}
			
	}

}