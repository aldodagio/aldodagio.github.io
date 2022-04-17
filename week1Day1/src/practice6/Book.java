package practice6;

public class Book {
	
	protected String title;
	protected String author; 
	protected String publisher;
	protected String pubDate;
	
	public Book() { 
		title = "default title";
		author = "default author";
		publisher = "default publisher";
		pubDate = "default published date";
	}
	public Book(String title, String author, String publisher, String pubDate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubDate = pubDate;
	}
	public void setTitle(String title) { this.title = title; }
	public void setAuthor(String author) { this.author = author; }
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public void setPubDate(String pubDate) { this.pubDate = pubDate; }
	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	public String getPublisher() { return publisher; }
	public String getPubDate() { return pubDate; }
	
	public void printInfo() {
		System.out.println("Book title: " + title + "\nAuthor name: " + author + "\nPublisher: " + publisher + "\nDate Published: " + pubDate);
	}

}
