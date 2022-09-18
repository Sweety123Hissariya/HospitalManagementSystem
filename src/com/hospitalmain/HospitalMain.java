package com.hospitalmain;

import java.util.Scanner;

import com.dao.DoctorDao;
import com.dao.MedicineDao;
import com.dao.PatientDao;
import com.entity.Doctor;
import com.entity.Medicine;
import com.entity.Patient;


public class HospitalMain {

	public static void main(String[] args) {
		int s1,c1;
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Please Login ");
        System.out.println("Enter Username and password");
        String username=sc.next();
        String password=sc.next();
        if(username.equalsIgnoreCase("sandipini") & password.equals("hospital123")){
        System.out.println("Press keys according to values");	
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("1.Doctos  2. Patients  3.Medicines ");
        System.out.println("-----------------------------------------------------------------------------------");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Delete the Doctor Detail\n3.Existing Doctors List\n4.Update Doctor Detail");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	System.out.println("Enter the name");
                                	String dname=sc.next();
                                	System.out.println("Enter the specilization");
                                	String dspecilization=sc.next();
                                	System.out.println("Enter the timing");
                                	String dtiming=sc.next();
                                	System.out.println("Enter the qualification");
                                	String dspec=sc.next();
                                	System.out.println("Enter the roomno");
                                	int droom=sc.nextInt();
                                	Doctor doctor=new Doctor(dname,dspecilization,dtiming,dspec,droom);
                                	boolean b=DoctorDao.insertDoctorValue(doctor);
                                	if(b) {
                                		System.out.println("Inserted Successfuly");
                                	}
                                	else {
                                		System.out.println("Something went wrong in insertion!");
                                	}
                                	break;
                                    
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    
                                    System.out.println("Enter the id you want to delete");
                                    int id=sc.nextInt();
                                    boolean b=DoctorDao.deleteDoctorValue(id);
                                    if(b) {
                                		System.out.println("deleted Successfuly");
                                	}
                                	else {
                                		System.out.println("Something went wrong in deletion!");
                                	}
                                    break;
                       
                                }
                            case 3:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                
                   
                
                                DoctorDao.showDoctorValue();
                                
                                break;
                   
                            }
                            case 4:
                            {
                         	   System.out.println("--------------------------------");
                         	   System.out.println("Enter the doctor id you want to update");
                               int id=sc.nextInt();
                         	   System.out.println("Enter the changed value");
                         	   String changed_att=sc.next();
                         	   boolean b= DoctorDao.UpdateDoctorDetail(id,changed_att);
                         	   if(b) {
                               		System.out.println("Updated Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in Updation!");
                               	}
                        
                        
                                break;
                            }
                        
                        }
                        System.out.println("\nReturn to Back Press 1 and for Exit press 0");
                        s1 = sc.nextInt();
                        System.out.println("Thank you...............................");
                    }
                    break;
                }
                	
            case 2: {
            	System.out.println("--------------------------------------------------------------------------------");
            	   System.out.println("                      **Patient SECTION**");
                   System.out.println("--------------------------------------------------------------------------------");
                   s1 = 1;
                   while (s1 == 1)
                   {
                       System.out.println("1.Add New Entry\n2.Delete the patient Detail\n3.Existing Patients List\n4.Update Patient");
                       c1 = sc.nextInt();
                       switch (c1)
                       {
                           case 1:
                               {
                               	System.out.println("Enter the name");
                               	String pname=sc.next();
                               	System.out.println("Enter the disease");
                               	String disease=sc.next();
                               	System.out.println("Enter the gender");
                               	String gender=sc.next();
                               	System.out.println("Enter the status");
                               	String status=sc.next();
                               	System.out.println("Enter the age");
                               	int age=sc.nextInt();
                               	Patient patient=new Patient(pname,disease,gender,status,age);
                       
                               	boolean b=PatientDao.insertPatientValue(patient);
                               	if(b) {
                               		System.out.println("Inserted Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in insertion!");
                               	}
                               	break;
                                   
                               }
                           case 2:
                               {
                                   System.out.println("--------------------------------------------------------------------------------");
                                   
                                   System.out.println("Enter the patient id you want to delete");
                                   int id=sc.nextInt();
                                   boolean b=PatientDao.deletePatientValue(id);
                                   if(b) {
                               		System.out.println("deleted Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in deletion!");
                               	}
                                  break; 
                      
                               }
                           case 3:
                           {
                               System.out.println("--------------------------------------------------------------------------------");
                               
                  
               
                               PatientDao.showPatientDetails();
                               
                               break;
                  
                           }
                           case 4:
                           {
                        	   System.out.println("--------------------------------");
                        	   System.out.println("Enter the patient id you want to update");
                        	   int id=sc.nextInt();
            
                        	   System.out.println("Enter the changed value");
                        	   String changed_att=sc.next();
                    
                        	   boolean b= PatientDao.UpdatePatientDetail(id,changed_att);
                        	   if(b) {
                              		System.out.println("Updated Successfuly");
                              	}
                              	else {
                              		System.out.println("Something went wrong in Updation!");
                              	}
                       
                       
                               break;
                           }
                       }
                           System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                           s1 = sc.nextInt();
                           System.out.println("Thank you...............................");
                   
                       }
                          break;
                           
                       }
                       
                case 3:
                      {
                           System.out.println("--------------------------------------------------------------------------------");
                           System.out.println("                      **Medicine SECTION**");
                           System.out.println("--------------------------------------------------------------------------------");
                           s1 = 1;
                           while (s1 == 1)
                           {
                               System.out.println("1.Expiry date Medicine\n2.Out of Stock Medicine List\n3.Add Medicine");
                               c1 = sc.nextInt();
                               switch (c1)
                               {
                                   case 1:
                                       {
                                    	   MedicineDao.ExpiryDateMedicine();
                                       	break;
                                           
                                       }
                                   case 2:
                                       {
                                           System.out.println("--------------------------------------------------------------------------------");
                                           
                                           MedicineDao.outOfStockMedicine();
                                           break;
                              
                                       }
                                   case 3:
                                   {
                                   	System.out.println("Enter the name of medicine");
                                   	String mname=sc.next();
                                   	System.out.println("Enter the composition");
                                   	String mcomp=sc.next();
                                   	System.out.println("Enter the expiry-date");
                                   	String exp_date=sc.next();
                                   	System.out.println("Enter the quantity");
                                   	int quan=sc.nextInt();
                  
                                   	Medicine med=new Medicine(mname,mcomp,exp_date,quan);
                           
                                   	boolean b=MedicineDao.addMedicine(med);
                                   	if(b) {
                                   		System.out.println("Inserted Successfuly");
                                   	}
                                   	else {
                                   		System.out.println("Something went wrong in insertion!");
                                   	}
                                   	break;
                                       
                                   }
                    
                               }
                              
                       }
                       
                       System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                       s1 = sc.nextInt();
                       System.out.println("Thank you...............................");
                      
                   }
                 
            
            
            }
        }
        else {
        	System.out.println("Sorry! Enter Correct Values");
        }
            
         
        
        
        }
        
	

}
