import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс для формирования боевых групп
 */
public class Group<A> implements Iterable<A> {
    /** Группа */
    List<A> group = new ArrayList<>();
    
        
    public void addCyborg (A newCyborg){
        group.add(newCyborg);    
    }

    public void addHuman (A newHuman){
        group.add(newHuman);
    }

    @Override
    public Iterator<A> iterator() {
        return group.iterator();
    }
    
}
