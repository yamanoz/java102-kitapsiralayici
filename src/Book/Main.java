package Book;


import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	 public static void main(String[] args) {
		 
		 
	       

	        TreeSet<Book> set = new TreeSet<Book>();
	        
	        set.add(new Book("Dervişin Teselli Koleksiyonu 3","Mecit Ömür Öztürk",324,"18.09.2023"));
	        set.add(new Book("Yazıyı Bulan Çocuk","Sinan Yaşar",120,"08.02.2020"));
	        set.add(new Book("İyileşme Zamanı","Funda Uçuk Er",240,"09.11.2019"));
	        set.add(new Book("Hain","Dr. Selim Erdoğan",384,"16.10.2023"));
	        set.add(new Book("Puslu Kıtalar Atlası", "İhsan Oktay Anar", 458, "1991, 1, 26"));
	        
	        Iterator<Book> itr=set.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next().getTitle());
	        }
	        

	        TreeSet<Book> set2 = new TreeSet<Book>(new BookPageComparator());
	        set2.add(new Book("Dervişin Teselli Koleksiyonu 3","Mecit Ömür Öztürk",324,"18.09.2023"));
	        set2.add(new Book("Yazıyı Bulan Çocuk","Sinan Yaşar",120,"08.02.2020"));
	        set2.add(new Book("İyileşme Zamanı","Funda Uçuk Er",240,"09.11.2019"));
	        set2.add(new Book("Hain","Dr. Selim Erdoğan",384,"16.10.2023"));
	        set2.add(new Book("Puslu Kıtalar Atlası", "İhsan Oktay Anar", 458, "1991, 1, 26"));

	        System.out.println("************");

	        for (Book book : set2)
	        {
	            System.out.println(book.getPage());
	        }
	    }

}
