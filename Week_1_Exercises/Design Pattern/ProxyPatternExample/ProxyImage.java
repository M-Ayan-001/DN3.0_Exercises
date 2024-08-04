
public class ProxyImage implements Image {

	private RealImage realIMG;
	private String filename;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realIMG == null) {
			realIMG = new RealImage(filename);
		} else {
			realIMG.display();
		}
	}

}
