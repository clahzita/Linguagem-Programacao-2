
public abstract class Item {
	
	private int posX;
	private int poxY;
	
	public Item(){}
	
	public Item(int posX, int poxY) {
		this.posX = posX;
		this.poxY = poxY;
	}

	public abstract void pegar();
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPoxY() {
		return poxY;
	}

	public void setPoxY(int poxY) {
		this.poxY = poxY;
	}
	
	

}
