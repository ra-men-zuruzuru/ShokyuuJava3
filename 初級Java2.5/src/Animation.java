
public class Animation extends MyFrame{
	public void run() {
		int x=30;
		setColor(0,128,0);
		while(x<=170) {
			clear();
			fillRect(x,80,10,100);
			x+=5;
			sleep(0.1);
		}
			
	}

}
