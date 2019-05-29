public class ListRunner
{
   public static void main (String[] args)
   {TODOLIST d= new TODOLIST(30);
      Task t= new Task(new Key("Monday",8));
      Task t2= new Task(new Key("Tuesday",8));
      
      // method insert() adds or inserts something the user wants into the list
      t.insert("Have a meeting");
      t.insert("Watch a movie");
      t.insert("Have dinner.");
      t.insert("See a friend.");
     
      
      // method remove() removes or deletes a task the user once inserted
     t.remove("Have a meeting");
   // method show() shows the current situation of the list
      t.show();
      
      //returns the key
      t.getKey();
      
  
      
      Key k= new Key("Monday",9);
      Task t4= new Task(k);
      
      // inserts a task onto the database
      d.insert(t4);
      
      Key k2= new Key("Monday",9);
      Task t3= new Task(k2);
      
      //deletes a task from the database
      d.delete(k);
      boolean p=d.insert(t3);
   
      System.out.println(p);
      t.show();
   
   //checks if some schedule is busy at certain day and hour
      k.equals(new Key("Friday",9));
   }
}