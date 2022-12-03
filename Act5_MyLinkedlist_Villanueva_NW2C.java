import java.util.*;
public class Act5_MyLinkedlist_Villanueva_NW2C {
    

  public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    // declaration of Linkedlist
    LinkedList firstname = new LinkedList();
    LinkedList middlename = new LinkedList();
    LinkedList lastname = new LinkedList();
    LinkedList areaCode = new LinkedList();
    LinkedList telNum = new LinkedList();
    LinkedList gender = new LinkedList();
    LinkedList agePer = new LinkedList();
    
    String fname, Mname, Lname, Tnum, sex;
    int code, age;

    System.out.print("How many members information will be entered? ");
    int Mcount = scanner.nextInt(); 
    scanner.nextLine();
    
    // This will ask the user on how many members to be processed.
    for(int i = 0; i < Mcount;i++){
        int count = i;
        count++; 
        
      System.out.println();
    
      // This will get the information needed to be processed.
      System.out.println("Kindly give the information of member " + count);
      System.out.print("Enter firstname: ");
       fname = scanner.nextLine();

      System.out.print("Enter middle name: ");
       Mname = scanner.nextLine();

      System.out.print("Enter last name: ");
     Lname = scanner.nextLine();

      System.out.print("Enter area code: ");
      code = scanner.nextInt();
  
      scanner.nextLine();
      System.out.print("Enter telephone number: ");
      Tnum = scanner.nextLine();

      System.out.print("Enter gender: ");
      sex = scanner.nextLine();

      System.out.print("Enter age: ");
      age = scanner.nextInt();
      scanner.nextLine();
       
        firstname.add(fname);
        middlename.add(Mname);
        lastname.add(Lname);
        areaCode.add(code);
        telNum.add(Tnum);
        gender.add(sex);
        agePer.add(age);
    }
     
    
    for(int i = 0; i < Mcount;i++){

  //Printing the information gathered from the user.....
    System.out.println("Welcome to the club " + firstname.get(i) +" " + middlename.get(i) + " "+ lastname.get(i)+ "!");
    System.out.println("Your area code and telephone number is " + "(" + telNum.get(i)+ ") " + areaCode.get(i)+"." );
    System.out.println("you are a 1" + gender.get(i) + " member and your age is " + agePer.get(i));
    System.out.println();
   
    }
}
}