/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheettwo;


import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class studentclass {
    public static void main(String[] args) {
        student obj[]=new student[100];
        for(int i=0;i<=9;i++)
        {
         obj[i]=new student();
         obj[i].getdata();
         obj[i].markcal();
         obj[i].display();
        }
        
    }
    
}
class student{
    String name,dept,status;
    double m1,m2,m3,a;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        name=obj.next();
        dept=obj.next();
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
    }
    void markcal()
    {
        double a=(m1+m2+m3)/3;
   
            if(a>=80)
                status="First class";
            else if(a>=70 && a<=79)
                status="second class";
            else if(a>=50 && a<=69)
                status="Third class";
            else 
                status="Fail";
        }
      void display()
    {
        double a=(m1+m2+m3)/3;
        System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"+m1+"M2:"+m2+"M3:"+m3+"\nAverage:"+a+"\nstatus:"+status);
        }
    }

