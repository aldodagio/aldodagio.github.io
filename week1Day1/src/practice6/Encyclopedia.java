package practice6;

public class Encyclopedia extends Book {
	
	private String edition;
	private String numVolumes;
	
	public Encyclopedia() {
		super();
		this.edition = "default edition";
		this.numVolumes = "default volume";
	}
	public Encyclopedia(String edition, String numVolumes) {
		this.edition = edition;
		this.numVolumes = numVolumes;
	}
	public Encyclopedia(String title, String author, String publisher, String pubDate, String edition, String numVolumes) {
		super(title,author,publisher,pubDate);
		this.edition = edition;
		this.numVolumes = numVolumes;
	}
	
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public void setNumVolume(String numVolumes) {
		this.numVolumes = numVolumes;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print(" \nEdition: " + edition + " \nVolume number: " + numVolumes);
	}
}
