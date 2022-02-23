import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 900);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    //Drawing grass (rectangle)
    fill(100,225,100);
    stroke(0);
    rect(0, (float) (height*0.6), (width), (height));

    //Drawing first house (base - rectangle) (roof - triangle)
    fill(129, 128, 128);
    stroke(4);
    rect((float) (width/4), (float) (height/2.5), (float) (width/2), (float) (height/2.5));
    
    fill(110, 110, 110);
    stroke(0);
    triangle((float) (width/4), (float) (height/2.5), (float) (width/2), (float) (height/5), (float) (width*0.75), (float) (height/2.5));
    
    fill(255, 100, 100);
    stroke(200);
    rect((float) (width*0.3125), (float) (height*0.6), (float) (width/8), (float) (height/5));

    //Drawing second house (base - rectangle) (roof - triangle)
    fill(110, 110, 110);
    stroke(0);
    triangle((float) (width*0.8125), (float) (height*0.58), (float) (width*0.875), (float) (height*0.54), (float) (width*0.9375), (float) (height*0.58));


    fill(128, 128, 128);
    stroke(0);
    rect((float) (width*0.8125), (float) (height*0.58), (float) (width/8), (float) (height*0.15));
    
    fill(255, 100, 100);
    stroke(200);
    rect((float) (width*0.83), (float) (height*0.63), (float) (width/20), (float) (height*0.096));

    //Drawing sun (circle)
    fill(255, 255, 0);
    stroke(4);
    ellipse((width), 0, (float) (width/4), (float) (height/5));


    //Drawing sign (pole - line) (sign body - rectangle)
    stroke(0);
    line((float) (width/8), (float) (height*0.92), (float) (width/8), (float) (height*0.7));

    
    fill(100, 200, 200);
    stroke(0);
    rect((float) (width/16), (float) (height*0.73), (float) (width/8), (float) (height/20));


    //Drawing window (rectangle)
    fill(225, 225, 225);
    rect((float) (width*0.475), (float) (height*0.49), (float) (width/4), (float) (height/10));

  }
  
  // define other methods down here.
}