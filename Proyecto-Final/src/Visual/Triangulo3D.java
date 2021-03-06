package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleArray;
import javax.media.j3d.TriangleFanArray;
import javax.media.j3d.TriangleStripArray;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;



public class Triangulo3D extends JDialog {

	private Canvas3D canvas3D;

	public Triangulo3D() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setSize(800, 700);
		
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
		BranchGroup objetoraiz = new BranchGroup();

		int tab[] = new int[1];
		tab[0] =3;


		TriangleFanArray ta = new TriangleFanArray(3,TriangleFanArray.COORDINATES|TriangleArray.COLOR_3,tab);
		ta.setCoordinate(0, new Point3f(0f,0.7f,0f));
		ta.setCoordinate(1, new Point3f(0.8f,-0.5f,-0f));
		ta.setCoordinate(2, new Point3f(-0.8f,-0.5f,-0f));
		ta.setColor(0, new Color3f(Color.RED));
		ta.setColor(1, new Color3f(Color.blue));
		ta.setColor(2, new Color3f(Color.yellow));
		for(int i =0;i<3;i++);



		TriangleFanArray ta1 = new TriangleFanArray(3,TriangleFanArray.COORDINATES|TriangleArray.COLOR_3,tab);
		ta1.setCoordinate(0, new Point3f(0f,0.7f,0f));
		ta1.setCoordinate(1, new Point3f(0.8f,-0.5f,0.7f));
		ta1.setCoordinate(2, new Point3f(-0.8f,-0.5f,0.7f));
		ta1.setColor(0, new Color3f(Color.RED));
		ta1.setColor(1, new Color3f(Color.blue));
		ta1.setColor(2, new Color3f(Color.yellow));
		for(int i =0;i<3;i++);



		int tab2[] = new int[1];
		tab2[0] =6;

		TriangleStripArray ta2 = new TriangleStripArray(6,TriangleFanArray.COORDINATES|TriangleStripArray.COLOR_3,tab2);
		ta2.setCoordinate(0, new Point3f(0f,0.7f,0f));
		ta2.setCoordinate(1, new Point3f(0.8f,-0.5f,-0f));
		ta2.setCoordinate(2, new Point3f(0.8f,-0.5f,0.8f));

		ta2.setCoordinate(3, new Point3f(0f,0.7f,0f));
		ta2.setCoordinate(4, new Point3f(-0.8f,-0.5f,0.7f));
		ta2.setCoordinate(5, new Point3f(-0.8f,-0.5f,-0f));

		ta2.setColor(0, new Color3f(Color.RED));
		ta2.setColor(1, new Color3f(Color.blue));
		ta2.setColor(2, new Color3f(Color.yellow));
		ta2.setColor(3, new Color3f(Color.RED));
		ta2.setColor(4, new Color3f(Color.blue));
		ta2.setColor(5, new Color3f(Color.yellow));
		for(int i =0;i<6;i++);



		Appearance app =new Appearance();


		TransformGroup objetoGiro = new TransformGroup();
		objetoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		objetoraiz.addChild(objetoGiro);



		objetoGiro.addChild(new Shape3D(ta,app));
		objetoGiro.addChild(new Shape3D(ta1,app));
		objetoGiro.addChild(new Shape3D(ta2,app));

		Alpha rotacionAlpha = new Alpha(-1, 16000);
		RotationInterpolator rotacion = new RotationInterpolator(rotacionAlpha, objetoGiro);
		rotacion.setSchedulingBounds(new BoundingSphere());
		objetoGiro.addChild(rotacion);

		MouseRotate mr = new MouseRotate();
		mr.setTransformGroup(objetoGiro);
		mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
		objetoraiz.addChild(mr);

		return objetoraiz;
	}
	
	public static void main(String[] args) {
		System.setProperty("sun.awt.noerasebackground", "true");
		Triangulo3D dialog= new Triangulo3D();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}

}