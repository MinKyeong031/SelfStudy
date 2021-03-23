package Ch22;

class Powder2{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
}
class Plastic2{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}
class ThreeDPrinter2<T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
}
class Water{
	public void doPrinting() {
		System.out.println("잘못된 재료로 출력");
	}
}

public class GenericTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDPrinter2<Powder2> oprinter = new ThreeDPrinter2<Powder2>();
		oprinter.setMaterial(new Powder2());
		Powder2 o = oprinter.getMaterial();
		o.doPrinting();
		
		ThreeDPrinter2<Plastic2> lprinter = new ThreeDPrinter2<Plastic2>();
		lprinter.setMaterial(new Plastic2());
		Plastic2 l = lprinter.getMaterial();
		l.doPrinting();
		
		ThreeDPrinter2<Water> wprinter = new ThreeDPrinter2<Water>();
		wprinter.setMaterial(new Water());
		Water w = wprinter.getMaterial();
		w.doPrinting();
	}

}
