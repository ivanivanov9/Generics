package generics;

public class Triangle extends GeometricObject {
	
	private double side = 1;
	
	public Triangle() {
	}
	
	public Triangle(double side) {
		this.setSide(side);
	}
	
	public Triangle(boolean fill, String color) {
		super(fill, color);
	}
	
	public Triangle(boolean fill, String color, double side) {
		super(fill, color);
		this.setSide(side);
	}



	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}




	@Override
	public int compareTo(GeometricObject o) {

		if(this.side- o.getSide()>0) {
			return 1;
		}else if(this.side- o.getSide()<0) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

}