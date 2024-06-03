//vectorじゃなくて配列
public class DisplayCarVector extends MyFrame {
	public void run() {
		Car[] carNum=new Car[5];
		int y=0;
		int vx=1;
		for(int i=0;i<5;i++) {
			carNum[i]=new Car(50,100+y,vx,0);
			y+=100;
			++vx;
		}
		for (int i = 0; i < 50; i++) {
			clear();
			for (int j = 0; j < 5; j++) {
				carNum[j].Draw(this);
				carNum[j].move();
			}
			sleep(0.1);
		}
		
	}

}
