public class Main 
  {
    public static void main(String[] args)
    {
     int a = 5;
      for(int j = 0 ;j <= 2; j++){
         for(int k = 0; k <= 4; k++){
           System.out.print(" * ");
           
           
           if(j + k == 4){
            
              break;
            }
           
          }
          System.out.print( a-- + "\n");
        }
          
          
      }
      
      
  }
