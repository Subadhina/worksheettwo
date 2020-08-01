/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheettwo;


/**
 *
 * @author ELCOT
 */
public class customerin {
    public static void main(String[] args) {
        customer c1=new customer(100,"Arra",10);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(15);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        
        invoice in=new invoice(1000,c1,2000);
        
         System.out.println(in.getid());
         System.out.println(in.getcustomer());
        
        customer c2=new customer(101,"Banu",14);
        in.setcustomer(c2);
        System.out.println(in.getamount());
        in.setamount(2500);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
        
    }
    
}
class customer
{
    int id;
    String name;
    int discount;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    void setdiscount(int d1)
    {
        discount=d1;
    }
    public String toString()
    {
        return "Name:"+name+"ID:"+id;    
    }
}
    class invoice
    {
        int id;
        customer o;
        double amount;
        invoice(int i,customer o1,double a)
        {
            id=i;
            o=o1;
            amount=a;
        }
        int getid()
        {
            return id;
        }
        customer getcustomer()
        {
            return o;
        }
       void setcustomer(customer o2)
       {
           o=o2;
       }
       double getamount()
       {
           return amount;
       }
       void setamount(double a)
       {
           amount=a;
       }
       String getcustomername()
       {
           return o.name;
       }
       double getamountafterdiscount()
       {
           return amount=((amount)*o.discount)/100;
       }
        
    }

    
    
