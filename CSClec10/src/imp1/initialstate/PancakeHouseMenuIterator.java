package imp1.initialstate;

import java.util.ArrayList;

/**
 * Created by sunny on 3/7/2017.
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList menuItm;
    private  int index;

    public PancakeHouseMenuIterator(ArrayList menuItm){
        this.menuItm = menuItm;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < menuItm.size();
    }

    @Override
    public Object next() {
        return menuItm.get(index++);
    }
}
