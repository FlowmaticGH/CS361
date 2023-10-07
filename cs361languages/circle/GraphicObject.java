/**
 * 
 */
package circle;

/**
 * @author cscharff
 *
 */

// abstract class

abstract class GraphicObject {

	private int pixelX, pixelY; //What are these variables for?

	abstract void moveTo(int newX, int newY);

	abstract void draw();

}
