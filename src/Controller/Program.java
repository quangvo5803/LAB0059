package Controller;

import java.util.ArrayList;

import Model.Person;
import Repository.FileRepository;
import Repository.IFileReopsitory;
import View.Menu;

public class Program extends Menu<String> {
    private IFileReopsitory fileReopsitory;
    static String[] menuChoice = {"Find person infor","Copy Text to new File","Exit"};
    ArrayList<Person> lp;

    public Program(){
        super("========== File Proccessing ==========", menuChoice);
        fileReopsitory = new FileRepository();
        lp = new ArrayList<>();
    }

    public void execute(int n){
        switch(n){
            case 1:{
                fileReopsitory.findPersonInfo(lp);
                break;
            }
            case 2:{
                fileReopsitory.coppyNewFile();
                break;
            }
            case 3:{
                System.exit(0);
            }
        }
    }

}
