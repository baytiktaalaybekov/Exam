import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public interface Service {


     public String createDB(List<Student>students);
     public void filterA();
     public void filterAge();
     public void filterPrice();
     public void filterPriceGirl();
     public void filterName();
     public void filterPriceName();
     public void filterNameA();
     public long filterL();
     public Map<Gender, List<Student>> filterGroup();



}
