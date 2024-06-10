
public class twocar extends MyFrame {
	public void run() {
		car car1=new car(30,20,2,0);
		car car2=new car(130,130,-2,0);
		for(int i=0;i<50;i++) {
			clear();
			car1.Draw(this);
			car2.Draw(this);
			car1.move();
			car2.move();
			sleep(0.1);
		}
	}

}
