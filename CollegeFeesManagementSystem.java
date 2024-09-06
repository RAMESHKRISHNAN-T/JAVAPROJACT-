
import java.util.Scanner;

public class CollegeFeesManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("  KSB Students Fees Detail");
        
        
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        
        System.out.print("Enter course name : ");
       
        String courseName = scanner.nextLine();
        System.out.println("Management Quato or Government Quota ");
        String quota=scanner.next();
        double mcourseFee=0;
    	double gcourseFee=0;
        if(quota.equals("mq")) {
        	
        	switch (courseName) {
            case "Computer scinece":
                mcourseFee = 100000; 
                System.out.println("The course Fees For The CSE Students:" + mcourseFee);
                break;
            case "Mech":
                mcourseFee = 50000;
                System.out.println("The course Fees For The Mech Students:" + mcourseFee);
                break;
            case "Ece":
                mcourseFee = 80000;
                System.out.println("The course Fees For Ece"
                		+ " Students:" + mcourseFee);
                break;
            default:
                System.out.println("Course fee not found for " + courseName);
        }}
        	else {
        		switch (courseName) {
                case "Computer scinece":
                    gcourseFee = 60000; 
                    System.out.println("The course Fees For The CSE Students:" + gcourseFee);
                    break;
                case "Mech":
                    gcourseFee = 30000;
                    System.out.println("The course Fees For The Mech Students:" + gcourseFee);
                    break;
                case "Ece":
                    gcourseFee = 50000;
                    System.out.println("The course Fees For Ece"
                    		+ " Students:" + gcourseFee);
                    break;
                default:
                    System.out.println("Course fee not found for " + courseName);
            }
        	}
        
        
         gcourseFee = getCourseFee(courseName);
         mcourseFee=getCourseFee(courseName);
        
        System.out.print("Is the student a day scholar or hostel resident? (day/hostel): ");
        String residenceType = scanner.nextLine();
        
        double hostelFee = 0;
        if (residenceType.equalsIgnoreCase("hostel")) {
        	hostelFee =80000;
            System.out.println("hostel fees is: "+hostelFee);
            
        }
        
        System.out.print("Does the student use college bus? (yes/no): ");
        String usesBus = scanner.next();
        
        String busFee;
        int busfees = 0;
        if (usesBus.equalsIgnoreCase("yes")) {
            System.out.print("Enter bus Stop: ");
            scanner.nextLine();
            busFee = scanner.nextLine();
            switch(busFee) {
            case "pollachi":
            {
            	busfees=8000;
            	System.out.println(busfees);
            	break;
            }
            case "coimbatore":
            {
            	busfees=5000;
            	System.out.println(busfees);
            	break;
            }
            case "tirupur":
            {
            	busfees=10000;
            	System.out.println(busfees);
            	break;
            }
            default:
            {
            	busfees=12000;
            	System.out.println(busfees);
            	break;
            }
            }
        }
        
      
        double totalFee = gcourseFee+mcourseFee + hostelFee+busfees;
        
        // Input fee paid by the student
        System.out.print("Enter fee paid by the student: ");
        double feePaid = scanner.nextDouble();
        
       
        double remainingFee = totalFee - feePaid;
        
        
        boolean isFullyPaid = (remainingFee <= 0);
        
        
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Course: " + courseName);
        System.out.println("Residence: " + residenceType);
        if (residenceType.equalsIgnoreCase("hostel")) {
            System.out.println("Hostel Fee: " + hostelFee);
        }
        if (usesBus.equalsIgnoreCase("yes")) {
            System.out.println("Bus Fee: " + busfees);
        }
        System.out.println("\nFee Details:");
        System.out.println("Total Fee + bus fees: " + totalFee);
        System.out.println("Fee Paid: " + feePaid);
        System.out.println("Remaining Fee: " + remainingFee);
        
       
        if (isFullyPaid) {
            System.out.println("Payment Status: Fully Paid");
        } else {
            System.out.println("Payment Status: Pending");
        }
        
       
        if (!isFullyPaid) {
            System.out.println("\nReminder: Please ensure timely payment to avoid inconvenience.");
        }
        
        scanner.close();
    }
    
    
    private static double getCourseFee(String courseName) {
        double courseFee = 0;
        switch (courseName) {
            case "Computer scinece":
                courseFee = 100000; 
                System.out.println("The course Fees For The CSE Students:" + courseFee);
                break;
            case "Mech":
                courseFee = 50000;
                System.out.println("The course Fees For The Mech Students:" + courseFee);
                break;
            case "Ece":
                courseFee = 80000;
                System.out.println("The course Fees For Ece"
                		+ " Students:" + courseFee);
                break;
            default:
                System.out.println("Course fee not found for " + courseName);
        }
        return courseFee;
    }
    
}
