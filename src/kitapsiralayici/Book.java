package kitapsiralayici;



public class Book {
	
	private String title;
	private String author;
	private int page;
	private String publishDate;



public Book(String title,String author,int page,String publishDate) {
	this.title=title;
	this.author=author;
	this.page=page;
	this.publishDate=publishDate;
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title=title;
}
public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public String getPublishDate() {
	return publishDate;
}

public void setPublishDate(String publishDate) {
	this.publishDate = publishDate;
}


public int compareTo(Book book) {
	return this.getTitle().compareTo(book.getTitle());
}

}
