/**
 * 
 */

/**
 * @author clarissa
 *
 */
public class Quadrado implements AreaCalculavel {
	
	private double lado;
	/* (non-Javadoc)
	 * @see AreaCalculavel#calcularArea()
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	
}
