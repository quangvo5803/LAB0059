package Repository;

import java.util.ArrayList;

import DataAccess.FileDao;
import Model.Person;

public class FileRepository implements IFileReopsitory {

    public FileRepository() {

    }

    @Override
    public void findPersonInfo(ArrayList<Person> lp) {
        FileDao.Instance().findPersonInfo(lp);
    }

    @Override
    public void coppyNewFile() {
        FileDao.Instance().coppyNewFile();
    }

}
