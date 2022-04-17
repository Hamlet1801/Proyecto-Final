package Visual;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.TriangleArray;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javafx.scene.shape.Polygon;

import java.awt.BorderLayout;



public class RepresentarCuadrado2D extends JPanel {

	/**
	 * Create the panel.
	 */
	public RepresentarCuadrado2D() {
		
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3d = new Canvas3D(config);
		setLayout(new BorderLayout());
		add(canvas3d);
		
		SimpleUniverse universo = new SimpleUniverse(canvas3d);
		universo.getViewingPlatform().setNominalViewingTransform();
		
		BranchGroup escena = crearGrafo();
		escena.compile();
		universo.addBranchGraph(escena);
		
		
	}

	
	
	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground","true");
		JFrame ventana = new JFrame("Representar Cuadrado");
		RepresentarCuadrado2D panel = new RepresentarCuadrado2D();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
public BranchGroup crearGrafo() {
		
		BranchGroup objetoraiz = new BranchGroup();
	 objetoraiz.addChild(new ColorCube(0.2));
		
	 
	 
	 
		
		
		return objetoraiz;


}
}
