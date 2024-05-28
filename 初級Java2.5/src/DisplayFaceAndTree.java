
public class DisplayFaceAndTree extends MyFrame{
	public void run() {
		Car car1=new Car(100,100,0,0);
		car1.Draw(this);
		for(int i=0;i<30;i++) {
			clear();
			car1.Draw(this);
			car1.move();
			sleep(0.1);
		}
	}

}
