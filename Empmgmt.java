/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt;

import java.util.*;


/**
 *
 * @author vaibhav
 */
public class Empmgmt {

   

        

     static int[]     empnum;
     static String[]  empname;
     static String[]  empdob;
     
     static Scanner scan = new Scanner(System.in);
     public static void main (String[] args)
    {
        Empmgmt em = new Empmgmt();
        em.menu();
    }
    public void menu ()
    {
        empnum = new int[100];
        empname = new String[100];
        empdob = new String[100];
        int option = 1;
        int empID;
 
        while(option != 5)
        {
            System.out.println();
            System.out.println("MENU --------------------------");
            System.out.println("1. Registration");
 
            System.out.println("2. Search by ID");
 
            System.out.println("3. Total Number of Employee");
 
            System.out.println("4. Employee List");
 
            System.out.println("5. Quit");
            System.out.println("--------------------------------");
            System.out.println();
            System.out.println("Select MENU 1-5:");
              option = scan.nextInt();

            switch(option)
            {
               case 1:
               Employreg();
               break;
               case 2:
               System.out.println("Search by ID:");
               empID = scan.nextInt();
               printspecEmp(empID);
               break;
               case 3:
               System.out.println("Total Number of Employee:");
               printEmployeecount();
               break;
               case 4:
               System.out.println("Employee List:");
               printEmployeeList();
               break;
               case 5:
               break;
               default:
               System.out.println("Invalid entry, Please choose from menu option.");
               break;
                   }
                   }
               }
       public void Employreg()
      {
          int  count = 0;
          int count2 = 0;
          int newEmployeeId = 0;
          while((count < empnum.length))
          {
             count++;
 
             if(count < empnum.length)
         {
                 System.out.println("Insert ID (2 Digits) :");
                 newEmployeeId = scan.nextInt();
                 scan.nextLine();
                 break;
         }
                 else
 
                 System.out.println("The database is full.");
          }
          while((count2 < empnum.length))
          {
 
             if(empnum[count2] == 0)
            {
             empnum[count2] = newEmployeeId;
 
             System.out.println("Insert name:");
             empname[count2] = scan.nextLine();

             System.out.println("Insert DOB (mm/dd/yy): ");
             empdob[count2] = scan.nextLine();
             break;
            }
             else
            {
             System.out.println("Employee already exists in database.");
            }
            count2++;
        }
    }
    public void printEmployeecount()
    {
        int count1 = 0;
        int k =0;
        while(count1<empnum.length)
        {
            if (empnum[count1] != 0)
                k++;
            count1++;
        }
        System.out.println(k);
    }
    public void printEmployeeList()
      {
          int  count = 0;
          
          while((count < empnum.length) && (empnum[count] != 0))
          {
             
 
                 System.out.printf("Employee id: %d",empnum[count]);
                 System.out.printf("%n");
                 System.out.printf("Employee Name: %s",empname[count]);
                 System.out.printf("%n");
                 System.out.printf("Employee DOB: %s",empdob[count]);
                 System.out.printf("%n");
            count++;
         }
    }            
    public void printspecEmp(int emid)
      {
          int  count = 0;
          
          while((count < empnum.length) && (empnum[count] != 0))
          {
                if(empnum[count] == emid)
                {
                 System.out.printf("Employee id: %d",empnum[count]);
                 System.out.printf("%n");
                 System.out.printf("Employee Name: %s",empname[count]);
                 System.out.printf("%n");
                 System.out.printf("Employee DOB: %s",empdob[count]);
                 System.out.printf("%n");
                 break;
                }
            count++;
          }
    }
}
   


