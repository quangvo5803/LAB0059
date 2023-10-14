package Repository;

import java.util.ArrayList;
import Model.Person;

public interface IFileReopsitory {
    void findPersonInfo(ArrayList<Person> lp);
    void coppyNewFile();
}
