package Visual;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class Cuadrado3d extends JPanel {
	
	public Cuadrado3d() {
		
		GraphicsConfiguration config= SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3D= new Canvas3D(config);
		
		setLayout(new BorderLayout());
		add(canvas3D);
		
		SimpleUniverse universo= new SimpleUniverse(canvas3D);
		universo.getViewingPlatform().setNominalViewingTransform();
		
		BranchGroup escena= crearGrafoEscena();
		escena.compile();
		
		universo.addBranchGraph(escena);
		
	}
	
	public BranchGroup crearGrafoEscena() {
		BranchGroup objetoRaiz= new BranchGroup();
		
		TransformGroup objetoGiro= new TransformGroup();
		objetoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);;
		objetoRaiz.addChild(objetoGiro);
		
		ColorCube cubo= new ColorCube(0.2f);
	    objetoGiro.addChild(cubo);
	    
	    Alpha rotacionAlpha= new Alpha(-1,3000);
	    
	    RotationInterpolator rotacion = new RotationInterpolator(rotacionAlpha, objetoGiro);
	    rotacion.setSchedulingBounds(new BoundingSphere());
	    
	    objetoRaiz.addChild(rotacion);
		
		return objetoRaiz;
	}
	
	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		JFrame ventana= new JFrame("Cuadrado 3D");
		Cuadrado3d panel = new Cuadrado3d();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
