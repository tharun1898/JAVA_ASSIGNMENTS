public class GFG {
  
    public static void main(String args[])
    {
        
        String str = "myenrollmentnumberis210303126228";
        String[] arrOfStr = str.split("8", 2);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}