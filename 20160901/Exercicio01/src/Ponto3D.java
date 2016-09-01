
public class Ponto3D extends Ponto2D{
	private double z;

	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str+= " z="+this.z;
		return str;
	}
	

}
