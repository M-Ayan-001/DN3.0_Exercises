
public class RealImage implements Image {
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		cachedIMG();
	}

	private void cachedIMG() {
		System.out.println("Loading and Showing " + filename + " IMG");
	}

	@Override
	public void display() {
		System.out.println("Showing " + filename + " IMG");
	}
}
