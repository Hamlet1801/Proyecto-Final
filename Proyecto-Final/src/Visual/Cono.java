package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class Cono extends JDialog {

	private Canvas3D canvas3D;

	public Cono() {
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
		
		Appearance aparienciaRoja= new Appearance();
		Color3f rojo= new Color3f(Color.RED);
		ColoringAttributes ca= new ColoringAttributes();
		ca.setColor(rojo);
		
		Cone cono= new Cone(2, 5, aparienciaRoja);
		objetoRaiz.addChild(cono);
		
		return objetoRaiz;
	}

	public static void main(String[] args) {
		
		System.setProperty("sun.awt.noerasebackground", "true");
		cubo dialog = new cubo();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	
    }

}
