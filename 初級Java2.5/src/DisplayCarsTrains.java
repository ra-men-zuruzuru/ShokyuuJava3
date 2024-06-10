import java.util.Vector;

public class DisplayCarsTrains extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new car(40,30,3,0));
		vehicles.add(new car(80,80,-3,0));
		vehicles.add(new Train(50,120,7,0));
		vehicles.add(new Train(80,170,-7,0));
		vehicles.add(new Truck(30,240,1,0));
		vehicles.add(new Truck(50,320,1,0));
		
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<vehicles.size();j++) {
				vehicles.get(j).Draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}
