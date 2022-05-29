import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        //Changed ArrayList to HashSet to refuse duplicate values since HashSet values are unique
        HashSet<String> employees = new HashSet<>();
        Scanner sc = new Scanner(new File("exercise13.txt"));

        while(sc.hasNext()){
            employees.add(sc.nextLine());
        }
        sc.close();
        System.out.println("This list has "+employees.size()+" "+"people");

        //Using for each loop
        for (String employee:employees) {
            System.out.println(employee);
        }

        //Using for standard loop
        for(int i = 0;i< employees.size();i++){
            System.out.println(employees);
        }

        //Using iterator interface
        Iterator<String>list = employees.iterator();
        while(list.hasNext()){
            String employee = list.next();
            System.out.println(employee);
        }

    }
}
