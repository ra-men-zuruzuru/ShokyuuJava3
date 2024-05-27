
public class Animation extends MyFrame{
	public void run() {
		int y=250;
		int x=30;
		setColor(0,128,0);
		while(y>=100) {
			clear();
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.1);
		}
		while(x<=180) {
			clear();
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}		
	}
}
