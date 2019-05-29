public class Task
{ private String task;  
   private Key id;
   String[] array= new String[30];
   public Task( Key id)
   { //this.task = task;
      this.id = id;
   }

   /**inserts a particular element on the array
   parameter s is the String to be added or inserted*/
   public void insert(String s)
   { 
      for(int i=0;i!=array.length;i++)
      {
         if(array[i]==null)
         {array[i]=s;
            break;// break is put there so the array is not fully filled with the same element
         }
        // else {i++;}
      }
   }
   /**removes a particular element from the array
   parameter t is the String to be removed*/
   public void remove(String t)
   {
      for(int j=0;j!=array.length;j++)
      {
         if(array[j]==t)
         {array[j]=null;
            break;}
      
      }
   
   }
   //shows the elements of the array
   public void show()
   {
      for(int j=0;j!=array.length;j++)
      {System.out.println(array[j]);
      }
        
   }
   //returns the Key asked for
   public Key  getKey() { 
      return id; }
}

