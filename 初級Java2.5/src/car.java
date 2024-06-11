import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class car extends Vehicle implements KeyListener {
	public car(int x,int y,int vx ,int vy) {
		super(x,y,vx,vy);
	}
	public void Draw(MyFrame frame) {
		frame.fillRect(x+20,y,40,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x+10,y+40,20,20);
		frame.fillOval(x+50,y+40,20,20);
	}
	
	//キーから文字が入力されたとき
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}

		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=5;
		}
		// TODO 自動生成されたメソッド・スタブ
	}
	
	//キーが離されたとき
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT ||
				e.getKeyCode()==KeyEvent.VK_RIGHT ||
				e.getKeyCode()==KeyEvent.VK_UP ||
				e.getKeyCode()==KeyEvent.VK_DOWN) {
			vx=0;
			vy=0;
		}
		// TODO 自動生成されたメソッド・スタブ
	}

}

