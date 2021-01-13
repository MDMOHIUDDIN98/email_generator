import java.util.Scanner;

import Email.Emailapp;
//project is to generate a general email for new user syntax is firstnme.lastnme.dep
//artment.company.com
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enter first nme and last nme using enter");
        Scanner obj=new Scanner(System.in);
        String nm=obj.nextLine();
        String nm1=obj.nextLine();
        System.out.println("Hello "+nm1);
        Emailapp e1=new Emailapp(nm,nm1);
        
}
}
