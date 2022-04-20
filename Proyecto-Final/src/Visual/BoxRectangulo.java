package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.TransformGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.universe.SimpleUniverse;

import logico.CentroEstudios;

public class BoxRectangulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.

	/**
	 * Create the dialog.
	 * @param f 
	 */
	public BoxRectangulo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setSize(800, 600);
		
		GraphicsConfiguration config= SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3D= new Canvas3D(config);
		
		setLayout(new BorderLayout());
		add(canvas3D);
		
		SimpleUniverse universo= new SimpleUniverse(canvas3D);
		
		JPanel panel = new JPanel();
		add(panel,BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
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
		
		
		Color3f rojo = new Color3f(Color.MAGENTA);
		ColoringAttributes eso = new ColoringAttributes();
		eso.setColor(rojo);
		app.setColoringAttributes(eso);
	   
	   
	    
		Box box = new Box(CentroEstudios.getInstance().getTamCubo()/10+0.2f, 0.2f, 0.5f, app);
	    mouseG.addChild(box);
	    
	    
	    
	    MouseRotate mr = new MouseRotate();
	    mr.setTransformGroup(mouseG);
	    mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
	    objetoRaiz.addChild(mr);
	    return objetoRaiz;
	}
	public static void main(String [] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		BoxRectangulo dialog = new BoxRectangulo();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}
	

}
