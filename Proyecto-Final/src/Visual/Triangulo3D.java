package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleArray;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;



public class Triangulo3D extends JPanel {

	/**
	 * Create the panel.
	 */
	public Triangulo3D() {
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
		System.setProperty("sun.awt.noerasebackground", "true");
		JFrame ventana= new JFrame("Triangulo3D");
		Triangulo3D  panel = new Triangulo3D ();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public BranchGroup crearGrafo() {
		
		BranchGroup objetoraiz = new BranchGroup();
	
	 
	 TriangleArray ta = new TriangleArray(3,TriangleArray.COORDINATES|TriangleArray.COLOR_3);
	 ta.setCoordinate(0, new Point3f(0f,0.7f,0f));
	 ta.setCoordinate(1, new Point3f(0.8f,-0.5f,0f));
	 ta.setCoordinate(2, new Point3f(-0.8f,-0.5f,0f));
	 ta.setColor(0, new Color3f(Color.RED));
	 ta.setColor(1, new Color3f(Color.blue));
	 ta.setColor(2, new Color3f(Color.yellow));
	 
	 TransformGroup objetoGiro = new TransformGroup();
	 objetoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	 objetoraiz.addChild(objetoGiro);
	 
	 objetoraiz.addChild(new Shape3D(ta));
	 
	 Alpha rotacionAlpha = new Alpha(-1, 16000);
	 RotationInterpolator rotacion = new RotationInterpolator(rotacionAlpha, objetoGiro);
	 rotacion.setSchedulingBounds(new BoundingSphere());
		objetoGiro.addChild(rotacion);
	 
	 
	 
		
		
		return objetoraiz;


}
}
