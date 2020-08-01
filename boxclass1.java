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
public class boxclass1 {
    public static void main(String[] args) {
        box obj=new box();
        obj.height=10;
        obj.width=20;
        obj.depth=30;
        obj.volume();
        
        
    }
    
}
class box{
    double height;
    double width;
    double depth;
    double vol;
    
   void volume()
    {
        vol=depth*height*width;
        System.out.println("voume"+vol);
    }
   
    
      
}
