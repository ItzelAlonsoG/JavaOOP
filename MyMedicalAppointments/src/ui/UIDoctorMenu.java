package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu (){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduale appointments");
            System.out.println("0. LogOut");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                    case 2:
                        break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while(response != 0);
    }

    private  static void showAddAvailableAppoitmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Selecth a Month");

            for (int i = 0; i < 3; i++) {

                int j = i+1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);

            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                //1,2,3
                int mothSelected = response;
                System.out.println(mothSelected+ ". " + UIMenu.MONTHS[mothSelected]);
                System.out.println("Insert the date availabre:[dd/mm/yyy]");
                String date = sc.nextLine();

                System.out.println("Your date : " + date + "\n1. Correct \n2 . Change Date");
                
            } else if (response == 0){
                showDoctorMenu();
            }
        }while(response !=0);
    }

}
