package nurus.percobaan2;

/**
 *
 * @author Nurus Laily
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CobaArrayList1841720049Nurus {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s ",element);
        }
    }
}
