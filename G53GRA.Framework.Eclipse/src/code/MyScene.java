package code;

import processing.core.*;		// import processing core
import processing.opengl.*;		// import processing/opengl bindings
import framework.engine.*;		// import framework classes
import framework.interfaces.*;	// import abstract classes for DisplayableObject and AnimatedObject
import code.objects.*;			// import your objects package
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
		
		Triangle t = new Triangle(this);		// create new Triangle (extends AnimatedObject implements Input)
		t.size(50.f);							// half size of triangle
		addObjectToScene(t,"triangle");			// add object to scene (with optional String id)
		
		super.initialise();						// call default initialisation for camera and projection. 
	}
	
	/**
	 * Override default global lighting.
	 * @see #lights()
	 */
	@Override
	protected void globalLighting(){
		super.globalLighting();
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
		super.initWidth = 800;	// must override variables in super class to affect size
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
		super.projection();	// calls default projection setup in Scene (orthographic)
	}
	
}
