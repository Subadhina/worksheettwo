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
public class boxclass2 {
    public static void main(String[] args){
      box obj=new box();
      obj.depth=10;
      obj.height=20;
      obj.width=30;
      obj.volume();
      
      box obj1=new box();
      obj1.depth=20;
      obj1.width=30;
      obj1.height=20;
      obj1.volume();
      
      
    }
}
      
class box{
    double depth;
    double width;
    double height;
    double vol;
    void volume()
    {
        vol=depth*height*width;
        System.out.println("volume"+vol);
    }
    
}   
    
    
    

