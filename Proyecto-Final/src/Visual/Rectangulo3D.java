package Visual;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Texture;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;

public class Rectangulo3D<NewTextureLoader>  extends JPanel {
	
	
	

	public Rectangulo3D () {
		
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
	   
	   
	    
		Box box = new Box(0.2f,0.2f,0.5f,app);
	    mouseG.addChild(box);
	    
	    
	    
	    MouseRotate mr = new MouseRotate();
	    mr.setTransformGroup(mouseG);
	    mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
	    objetoRaiz.addChild(mr);
	    
	    
	 
	    	/**TransformGroup objetoGiro= new TransformGroup();
		objetoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);;
		objetoRaiz.addChild(objetoGiro);**/
	    
	    
	    //Camera camera = new PerspectiveCamera();
	   // Alpha rotacionAlpha= new Alpha(-1,3000);
	    ///RotationInterpolator rotacion = new RotationInterpolator(rotacionAlpha, objetoGiro);
	   // rotacion.setSchedulingBounds(new BoundingSphere());
	    //objetoRaiz.addChild(rotacion);
	    
	    
	   
	    		
		
		return objetoRaiz;
		
	}
	
	
	

	

	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		JFrame ventana= new JFrame("Rectangulo 3D ");
		Rectangulo3D  panel = new Rectangulo3D ();
		ventana.add(panel);
		ventana.setSize(700, 700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
	
	
	
	  






	

