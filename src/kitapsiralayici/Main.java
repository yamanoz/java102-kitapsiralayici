package kitapsiralayici;


import java.util.TreeSet;

public class Main {

	 public static void main(String[] args) {
	        Book gny = new Book("Google Nasıl Yönetiliyor?", "Eric Schmidt", 452, "1999, 1, 26");
	        Book denemeler = new Book("Denemeler", "Montaigne", 273, "1846, 1, 26");
	        Book ys = new Book("Yalanın Siyaseti", "Yalın Alpay", 289, "2017, 1, 26");
	        Book tutunamayanlar = new Book("Tutunamayanlar", "Oğuz Atay", 687, "1989, 1, 26");
	        Book pka = new Book("Puslu Kıtalar Atlası", "İhsan Oktay Anar", 458, "1991, 1, 26");

	        TreeSet<Book> set = new TreeSet<>();
	        set.add(gny);
	        set.add(denemeler);
	        set.add(ys);
	        set.add(tutunamayanlar);
	        set.add(pka);

	        for (Book book : set)
	        {
	            System.out.println(book.getTitle());
	        }

	        TreeSet<Book> set2 = new TreeSet<>(new BookPageComparator());
	        set2.add(gny);
	        set2.add(denemeler);
	        set2.add(ys);
	        set2.add(tutunamayanlar);
	        set2.add(pka);

	        System.out.println("************");

	        for (Book book : set2)
	            System.out.println(book.getPage());
	    }

}
