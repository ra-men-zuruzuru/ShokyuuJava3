public class RectLoop extends MyFrame {
	public void run() {
		setColor(0,128,0);
		int x=30;
		for(int i=0;i<10;i++) {
			if(i==0) {
				fillRect(x,50,10,100);
			}else if(i==9) {
				fillRect(x,100,10,100);
			}else {
				fillRect(x,80,10,100);
			}
			
			x+=20;
		}
	}

}

