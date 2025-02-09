import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LampCollection {
    List<Lamp> sortByName(List<Lamp> lamps){
        lamps.sort(Comparator.comparing(Lamp::getName));
        return lamps;
    }
    List<Lamp> getByName(List<Lamp> lamps, String name) {
        List<Lamp> results = new ArrayList<>();
        for(Lamp lamp : lamps){
            if(lamp.getName().equals(name)){
                results.add(lamp);
            }
    }
        return results;
    }
}
