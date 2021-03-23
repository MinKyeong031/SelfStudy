package Ch13;

public class ConviStore {
	private int id;
	String PName;
	public ConviStore(int id, String PName) {
		this.id = id;
		this.PName = PName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
}