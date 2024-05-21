
public class ManyFigures extends MyFrame {
	public void run() {
		//追加課題その２
		setColor(0,128,0);
		fillRect(100,100,200,200);
		int y=250;
		int x=100;
		int xx=110;
		setColor(256,256,256);
		for(int i=0;i<10;i++) {
			fillRect(x,y,10,30);
			fillRect(xx,100,10,200);
			x+=20;
			y-=10;
			xx+=20;
		}
	}

}
