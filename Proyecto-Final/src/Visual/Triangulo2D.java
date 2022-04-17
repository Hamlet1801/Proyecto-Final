package Visual;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangulo2D extends JPanel {

	/**
	 * Create the panel.
	 */
	public Triangulo2D() {

	}
	
	
	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		JFrame ventana= new JFrame("Triangulo2D");
		Triangulo2D  panel = new Triangulo2D ();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		int[] puntosx = {200,100,300};
		int[] puntosy = {200,600,600};
		g.fillPolygon(puntosx, puntosy, 3);
	}

}
