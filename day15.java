public class day15  {

    public static void main(String[] args) {
        
        // Operator logika
        
        
        boolean x,y,z;
        
        // OR / atau (||)
        
        System.out.println("______OR ( || )_______");
             x = false; 
             y = false;
             z = (x||y);
        System.out.println(x + " || " + y + " = " + z);
        
             x = false; 
             y = true;
             z = (x||y);
        System.out.println(x + " || " + y + " = " + z);
  
             x = true; 
             y = true;
             z = (x||y);
        System.out.println(x + " || " + y + " = " + z);
  
        
        // AND / atau (&&)
        System.out.println("______AND (&&)_______");
             x = false; 
             y = false;
             z = (x && y);
        System.out.println(x + " && " + y + " = " + z);
        
             x = false; 
             y = true;
             z = (x && y);
        System.out.println(x + " && " + y + " = " + z);
  
             x = true; 
             y = true;
             z = (x && y);
        System.out.println(x + " && " + y + " = " + z);
        
        
        // XOR / exlusive or (^);
        
        System.out.println("______XOR ( ^ )_______");
             x = false; 
             y = false;
             z = (x ^ y);
        System.out.println(x + " ^ " + y + " = " + z);
        
             x = false; 
             y = true;
             z = (x ^ y);
        System.out.println(x + " ^ " + y + " = " + z);
  
             x = true; 
             y = true;
             z = (x ^ y);
        System.out.println(x + " ^ " + y + " = " + z);
  
        // NOT / negasi (!)
        System.out.println("____NEGASI (!) ");
             x = true;
             z = !x;
        System.out.println(x + " ---> (!) = " + z);
             
             x = false;
             z = !x;
        System.out.println(x + "---> (!) = " + z);
        
        
    }
}