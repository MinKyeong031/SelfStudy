package Ch22;

class Powder{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
}
class Plastic{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}
class ThreeDPrinter{
	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder p1 = new Powder();
		printer.setMaterial(p1);
		Powder p2 = (Powder)printer.getMaterial();
	}

}
