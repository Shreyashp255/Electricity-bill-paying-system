import java.util.Scanner;
public class Electricity_paying_system1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.next();
        System.out.println("Enter Your Registered Mob: ");
        long no=sc.nextLong();
        System.out.println("Enter Connection Number: ");
        long con=sc.nextLong();
        System.out.println("Enter Your Address: ");
        String add=sc.next();
        System.out.println("Record From Year to Year! \n");
        System.out.println("Enter months from which bill is pending: ");
        int mon=sc.nextInt();

        System.out.println("**** Online Billing System ****\n");
        System.out.println(" 1.Show User Details\n 2.Pay Bill\n 3.Rating\n 4.Exit from menu\n");
        System.out.println("Please Choose From Above Options: ");
        int choice=sc.nextInt();
        switch(choice)
        {

            case 1:
            System.out.println("Users Name: "+name);
            System.out.println("Users Reg. Mob: "+no);
            System.out.println("Users Connection Number: "+con);
            System.out.println("Users Address: "+add);
            System.out.println("Bill is Pending From "+mon+" Months");

            case 2:
            long amt=10000;
            if(mon==1)
            {
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);


            }
            else if(mon==2)
            {
                amt=amt+10000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==3)
            {
                amt=amt+20000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==4)
            {
                amt=amt+30000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==5)
            {
                amt=amt+40000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==6)
            {
                amt=amt+50000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==7)
            {
                amt=amt+60000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==8)
            {
                amt=amt+70000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==9)
            {
                amt=amt+80000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==10)
            {
                amt=amt+90000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==11)
            {
                amt=amt+100000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else if(mon==12)
            {
                amt=amt+110000;
                System.out.println("Pending Bill is: "+amt);
                System.out.println("Enter the Paying Amount: ");
                long am=sc.nextInt();
                amt=amt-am;
                System.out.println("Bill Payed Successfully!\n");
                System.out.println("Pending Billing Amount is: "+amt);

            }
            else{
                System.out.println("Please Enter Valid Month!");
            }
            break;

            case 3:
            System.out.println("Please Rate our Service From 5 Stars! \n");
            System.out.println("How Many Stars are you interested to give: ");
            int star=sc.nextInt();
            if(star==5)
            {
                System.out.println("Great Thank You For Your Positive Response! \n");
            }
            else if(star<=4&&star>0)
            {
                System.out.println("Your Response is Been Recorded! ");
            }
            else
            {
                System.out.println("Invalid Input! ");
            }
            break;

            case 4:
            System.exit(0);

            default:
            System.out.println("Please enter valid input! ");
            break;
            
        }

    }
}

//Contributed by Shreyash