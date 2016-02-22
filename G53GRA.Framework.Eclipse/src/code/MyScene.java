package code;

import processing.core.*;		// import processing core
import processing.opengl.*;		// import processing/opengl bindings
import framework.engine.*;		// import framework classes
import framework.interfaces.*;	// import framework interfaces
import code.objects.*;			// import your objects package
import code.demos.*;
import code.demos.triforce.*;
import code.demos.viewing.Floor;
import code.demos.animatedlamp.Lamp;
import code.demos.solarsystem.*;

/**
 * Your main Coursework class. Inherits {@code framework.}{@link Scene}. Edit this class.  
 * @author {your_name}
 * @version 1.0.0
 */
public class MyScene extends Scene {
	/**
	 * Setup your {@code Scene} in this method. Create any {@code DisplayableObject}s and {@code AnimatedObject}s
	 * and add them to the {@code Scene}.
	 * <p>
	 * Call {@code super.initialise()} to setup the framework's default  {@linkplain framework.utility.Camera Camera} and {@linkplain Scene#projection() projection} settings.
	 * @see DisplayableObject
	 * @see framework.interfaces.Animation Animation
	 * @see framework.utility.Camera Camera
	 * @see framework.interfaces.Input Input
	 */
	@Override
	public void initialise(){		
		setBackgroundColour(0.f,0.f,0.f,1.f);	// set clear colour to black
		
		// DEMO 1
//		Triangle t = new Triangle(this);		// create new Triangle (extends AnimatedObject implements Input)
//		t.size(0.5f);							// half size of triangle
//		addObjectToScene(t,"triangle");			// add object to scene (with optional String id)

		// DEMO 2
//		Triforce t = new Triforce(this);
//		t.size(50.f);
//		addObjectToScene(t,"triforce");

		// DEMO 3
//		Planet sun  = new Planet(this,0.f,PI/15.f,0.f);
//		sun.size(30.f);
//		sun.setColour(255, 255, 0);
//		
//		Planet mars = new Planet(this,40.f,PI,PI/6.f);
//		mars.size(6.f);
//		mars.setColour(255,0,0);
//		
//		Planet earth = new Planet2(this,80.f,PI/2.f,PI/6.f,0.4f,2.f,PI/2.f,PI/20.f);
//		earth.size(15.f);
//		earth.setColour(0,0,255);
//		
//		addObjectToScene(sun,"sun");
//		addObjectToScene(mars,"mars");
//		addObjectToScene(earth,"earth");
		
		// DEMO 4
//		Lamp lamp = new Lamp(this);
//		lamp.size(10.f);
//		addObjectToScene(lamp,"lamp");		
//		
		
		// DEMO 5
		Floor f = new Floor(this);
		Triangle t = new Triangle(this);
		f.size(100.f);
		f.position(0.f,150.f,0.f);
		t.size(0.5f);
		addObjectToScene(f);
		addObjectToScene(t);
		
		super.initialise();						// call default initialisation for camera and projection. 
		
	}
	
	/**
	 * Override default global lighting.
	 * @see #lights()
	 */
	@Override
	protected void globalLighting(){
		super.globalLighting();
		lightSpecular(255.f,255.f,255.f);
		directionalLight(200.f,200.f,200.f,-1.f,1.f,1.f);
	}
	
	/**
	 * Override default reshape function. Called during every iteration of {@link #draw()}.
	 * Use this method to handle resizing objects based on your window size.
	 * @see #getObject(String)
	 * @see #projection()
	 */
	protected void reshape(){
		super.reshape();
	}
	
	/**
	 * Override default initial window size (600x400). Adjust variables in {@code super} class to change values.
	 */
	@Override
	protected void setInitWindowSize(){
		super.initWidth = 1200;	// must override variables in super class to affect size
		super.initHeight = 700;
	}
	
	/**
	 * Override projection properties here. Remove call to {@code super.projection()} and replace with
	 * perspective mode.
	 * @see #perspective(float, float, float, float)
	 * @see #ortho(float, float, float, float, float, float)
	 * @see #frustum(float, float, float, float, float, float)
	 */
	@Override
	protected void projection(){
		//super.projection();	// calls default projection setup in Scene (orthographic)
		perspective(radians(60.f),(float)width/(float)height, 1.f, 1000.f);
	}
	
}
