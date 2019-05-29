public class Key
{ private int k;  
   private String d="";
   String[] s= new String[5];
   public Key(String day, int time) {  
      d=day;
      k = time; }

  /** equals  compares this Key to another for equality
    * @param c - the other key
    * @return true, if this key equals k's; return false, otherwise */
   public boolean equals(Key c)
   { 
      return  ( k == c.getInt() && d.equals(c.getString())); }
  
//returns the value of the integer type key
   public int getInt() { 
      return k; }
  //returns the value of the String type key
   public String getString() {
      return d;}
  

}