package Email;
import java.util.*;
public class Emailapp {
    private String firstnme;
    private String lastnme;
    private String pasword;
    private String department;
    private String alterntemail;
    private int capacity;
    private String company="Mohi";
    int i;
    //constructor for recieve first and last name and do other task
    public Emailapp(String firstnme, String lastnme) 
    {
        this.firstnme=firstnme;
        this.lastnme=lastnme;
       // System.out.println("Email is :"+this.firstnme+" "+this.lastnme);
        this.department=setdepartmen();//call method department
       // System.out.println(this.department);
        this.pasword=setpasswor(8);//call method for password
        System.out.println("your password is:"+pasword);
       // System.out.println("enter the capacity of email storage");
        //this.capacity=setcapcity();//method calling for capacity
        //System.out.println("capacity is:"+this.capacity);
        this.alterntemail=this.firstnme.toLowerCase()+"."+this.lastnme.toLowerCase()+"."+this.department;
System.out.println("generated Company email is: "+this.alterntemail+"@"+this.company+".com");
    }
    private int setcapcity()
    {
        Scanner obj=new Scanner(System.in);
        int cap=obj.nextInt();
        return cap;
    }
    private String setdepartmen()
    {
        System.out.println("enter your deprtment no\n1 for sales\n2 for devloper\n3 for testing");
        Scanner in=new Scanner(System.in); 
        int departmt=in.nextInt();
        if(departmt==1)
            return "Sal";
        if(departmt==2)
            return "devl";
        if(departmt ==3)
            return "test";
        else 
            return "wrong input";
    }
    private String setpasswor(int length)
    {
        String password="QWERTYUIOPLKJHGFDSAZXCVBNM1234567890!@#$%^&*()";
        char[] arr=new char[length];
        for(i=0;i<length;i++)
        {
            int rand=(int) (Math.random()*password.length());
            arr[i]=password.charAt(rand);
        }
        return new String(arr);
    }
    //call a method for department and return it
}
