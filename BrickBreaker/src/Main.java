import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Brick Breaker");
		
		BrickBreakerPanel panel= new BrickBreakerPanel();
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500, 600);

	}

}
