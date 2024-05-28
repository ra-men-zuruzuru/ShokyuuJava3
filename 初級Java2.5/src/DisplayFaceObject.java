
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face();
		face1.x=100;
		face1.y=50;
		face1.Draw(this);
		
		Face face2=new Face();
		face2.x=200;
		face2.y=100;
		face2.Draw(this);
	}

}
