package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

import logico.CentroEstudios;

public class cubo extends JDialog {

	private Canvas3D canvas3D;

	public cubo() {
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

	private BranchGroup crearGrafoEscena() {
		
        BranchGroup objetoRaiz= new BranchGroup();
		
		TransformGroup objetoGiro= new TransformGroup();
		objetoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);;
		objetoRaiz.addChild(objetoGiro);
		
		//ColorCube cubo= new ColorCube(CentroEstudios.getInstance1().getTamCubo()/10);
		
	    //objetoGiro.addChild(cubo);
	    
	    Alpha rotacionAlpha= new Alpha(-1,3000);
	    
	    RotationInterpolator rotacion = new RotationInterpolator(rotacionAlpha, objetoGiro);
	    rotacion.setSchedulingBounds(new BoundingSphere());
	    
	    objetoRaiz.addChild(rotacion);
		
		return objetoRaiz;
	}
	
	public static void main(String [] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		cubo dialog = new cubo();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}
	
}
