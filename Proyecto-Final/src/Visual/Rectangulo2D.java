package Visual;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class Rectangulo2D extends JPanel {

	/**
	 * Create the panel.
	 */
	public Rectangulo2D() {
		
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
		
		
		
		TransformGroup mouseG= new TransformGroup();
		mouseG.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		mouseG.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
		objetoRaiz.addChild(mouseG);
		
		Appearance app =new Appearance();
		
	    PolygonAttributes polyattr = new PolygonAttributes();
	    polyattr.setPolygonMode(PolygonAttributes.POLYGON_FILL);
	    app.setPolygonAttributes(polyattr);
	    polyattr.setCullFace(PolygonAttributes.CULL_NONE);
	    
	    
		Box box = new Box(0.5f,0.2f,0.5f,app);
	    mouseG.addChild(box);
	    
	    
	    MouseRotate mr = new MouseRotate();
	    mr.setTransformGroup(mouseG);
	    mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
	    objetoRaiz.addChild(mr);
	    
	    
	    
	    
	    
	
	    
	   
	    		
		
		return objetoRaiz;
		
	}
	
	
	

	

	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		JFrame ventana= new JFrame("Rectangulo 2D ");
		Rectangulo2D  panel = new Rectangulo2D ();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	}


