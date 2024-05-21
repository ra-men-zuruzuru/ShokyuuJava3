
public class ManyFigures extends MyFrame {
	public void run() {
		
			setColor(0,128,0);//追加課題その１
			int x=40;
			int y=30;
			for(int i=0;i<15;i++) {
				fillRect(x,x,y,y);
				x+=30+i*10;
				y+=10;
		}
	}

}
