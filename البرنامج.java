//خالد وليد إسماعيل الشجاع

import java .util.Scanner ;
class information{
	String Name ;
	int num;
	char p;
	int Babery;
	char jop;
	int Paycheck;
	}
public class Main {
 public static Scanner in = new Scanner(System.in);
 public static void main(String[] args) {
    information[]Me=new information[50];
          for (int i =1 ; i <=50 ; i++ ) {
      	Me[i]=new information();
    	System.out.println( i+ "  ادخل الاسم ");
        String k  =in.next( );
        System.out.println( "ادخل رقم البطاقه");
        Me[i].num=in.nextInt();
        System.out.println("ادخل الحاله الاجتماعية");
        Me[i].p=in.next().charAt(0);
         if(Me[i].p== 'm'){
        	System.out.println("ادخل عدد الاطفال");
             Me[i].Babery=in.nextInt();  
        System.out.println("هل انت موظف");
   	 Me[i].jop=in.next().charAt(0);
    	if ( Me[i].jop=='n'){
         System.out.println("مبروك عليك السلة");
         Me[i].Name=k;
        break;}
       else{
         System.out.println("كم هو راتبك");
         Me[i].Paycheck=in.nextInt ();
    if(Me[i].Paycheck>=60&&Me[i].Babery<=3){
        	System.out.println("انت لست مستحق");
     i -- ;   }
      else if (Me[i].Paycheck>=60&&Me[i].   Babery>=5){
   	System.out.println("مبروك عليك السلة");	
        Me[i].Name=k;
        break;}
         else if (Me[i].Paycheck<=60&&Me[i].   Babery>=2){
      Me[i].Name=k;
      System.out.println ("  مبروك عليك السلة الغذائية"); 
        	  break;}  
        }   }
     else
     System.out.println("انت غير مستحق") ;	}	
 }
	 public static void printdd( information[]Me){
		for(int i=0;i<50;i++)		
	System.out.println(Me[i].Name);			
	}   
	}