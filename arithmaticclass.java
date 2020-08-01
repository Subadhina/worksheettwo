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
public class arithmaticclass {
    public static void main(String[] args) {
        arithmatic s=new arithmatic();
        int a=10;
        int b=30;
        System.out .println("Addition");
        System.out.println(s.add(a,b));
        System.out.println("Subtraction");
        System.out.println(s.sub(a,b));
        System.out.println("Multiplication");
        System.out.println(s.mul(a,b));
        System.out.println("Division");
        System.out.println(s.div(a,b));
        
        
    }
    
}
class arithmatic{
    
    int add(int a, int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
     

