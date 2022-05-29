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

        //Creating a small program to test out Hashset.contains()
        System.out.println("Would you like to check for your name?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("yes")){
            System.out.println("Please enter your full name");
            Scanner user = new Scanner(System.in);{
                boolean checking = employees.contains(user.nextLine());
                if(checking == true){
                    System.out.println("YES it is");
                }else{
                    System.out.println("Nope");
                }
            }
        }else{
            System.out.println("BYE");
        }

    }
}
