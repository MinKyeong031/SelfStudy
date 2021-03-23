package Ch22;

abstract class Material{
	public abstract void doPrinting();
}
class Powder3 extends Material{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력!");
	}
}
class Plastic3 extends Material{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력!");
	}
}
class Water2 extends Material{
	public void doPrinting() {
		System.out.println("잘못된 재료로 출력");
	}
}
class ThreeDPrinter3<T extends Material>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
}

public class GenericTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDPrinter3<Powder3> oprinter = new ThreeDPrinter3<Powder3>();
		oprinter.setMaterial(new Powder3());
		Powder3 o = oprinter.getMaterial();
		o.doPrinting();
		
		ThreeDPrinter3<Plastic3> lprinter = new ThreeDPrinter3<Plastic3>();
		lprinter.setMaterial(new Plastic3());
		Plastic3 l = lprinter.getMaterial();
		l.doPrinting();
		
		ThreeDPrinter3<Water2> wprinter = new ThreeDPrinter3<Water2>();
		wprinter.setMaterial(new Water2());
		Water2 w = wprinter.getMaterial();
		w.doPrinting();
	}

}
