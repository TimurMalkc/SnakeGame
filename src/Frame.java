import javax.swing.JFrame;

public class Frame extends JFrame{

	AnimationPanel panel = new AnimationPanel();
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setVisible(true);
		this.pack();
	}

}
