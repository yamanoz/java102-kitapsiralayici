package kitapsiralayici;

import java.util.Comparator;

public class BookPageComparator implements Comparator<Book>{

	
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getPage()-o2.getPage();
	}

}
