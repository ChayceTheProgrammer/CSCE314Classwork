package Week11;

public class ExtendedCube /*How we start inheritance in java -> */extends Cube {
	public double getSurfaceArea() {return 6 * getSide()* getSide();}
	public double getVolume() {return getSide()* getSide() * getSide();}
	public String toString() {
		return "This cube's side length is " + getSide() + "\n" +
				"This cube's surface area is " + getSurfaceArea() + "\n" +
				"This cube Volume is " + getVolume() + "\n";
		}
}

