package Week11;

public class CubeDriver {

	public static void main(String args[]) {
		
		Cube basic = new Cube();
		ExtendedCube advanced = new ExtendedCube();
		
		
		System.out.println("Setting Side lengths");
		basic.setSide(6);
		advanced.setSide(10);
		
		basic.toString();
		advanced.toString();
		
		System.out.println("Changing Side lengths");
		basic.setSide(90.0);
		advanced.setSide(100.0);
		
		
		System.out.println(basic);
		System.out.println(advanced);	
	}
	
}
