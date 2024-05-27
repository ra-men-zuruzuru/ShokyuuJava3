
public class Animation extends MyFrame{
	public void run() {
		int y=100;
		int x=30;
		setColor(0,128,0);
		while(y<=200) {
			clear();
			fillRect(x,y,10,100);
			y+=5;
			x+=5;
			sleep(0.1);
		}
		while(x>=30) {
			clear();
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
		}	
		while(y>=100) {
			clear();
			fillRect(x,y,10,100);
			x+=5;
			y-=5;
			sleep(0.1);
		}
	}
}
